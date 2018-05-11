package top.daxianwill.frame;
import android.app.Application;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import top.daxianwill.frame.local.table.DaoMaster;
import top.daxianwill.frame.local.table.DaoSession;

/**
 */

public class AndroidApplication extends Application{

    private static final String DB_NAME = "frame-db";
    //注意：mHelper会在数据库升级时，删除所有的表，应该做一层封装，安全升级。
    private DaoMaster.DevOpenHelper mHelper;
    //通过DaoMaster内部类DevOpenHelper,得到一个SqliteOpenHelper对象
    private SQLiteDatabase db;
    private DaoMaster daoMaster;
    private DaoSession daoSession;
    private static Context mContext;
    private static AndroidApplication mApplication;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();
        mApplication = this;
        setDatabase();
    }
    private void setDatabase(){
        mHelper = new DaoMaster.DevOpenHelper(mContext,DB_NAME);
        db = mHelper.getWritableDatabase();
        // 注意：该数据库连接属于 DaoMaster，所以多个 Session 指的是相同的数据库连接。
        daoMaster = new DaoMaster(db);
        daoSession = daoMaster.newSession();
    }

    public DaoMaster getDaoMaster(){
        return daoMaster;
    }

    public DaoSession getDaoSession(){
        return daoSession;
    }

    public static AndroidApplication getInstance() {
        return mApplication;
    }

    public static Context getContext() {
        return mContext;
    }

}

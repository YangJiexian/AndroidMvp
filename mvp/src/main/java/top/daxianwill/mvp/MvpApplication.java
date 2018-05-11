package top.daxianwill.mvp;

import android.app.Application;
import android.database.sqlite.SQLiteDatabase;

import top.daxianwill.mvp.entity.DaoMaster;
import top.daxianwill.mvp.entity.DaoSession;

/**
 * Created by admin on 2018/4/27.
 */

public class MvpApplication extends Application {

    private static final String DB_NAME = "mvp_db";

    DaoMaster.DevOpenHelper devOpenHelper;
    SQLiteDatabase db;
    DaoMaster daoMaster;
    DaoSession daoSession;
    @Override
    public void onCreate() {
        super.onCreate();
        initDatabase();
    }

    private void initDatabase() {
        devOpenHelper = new DaoMaster.DevOpenHelper(getApplicationContext(),DB_NAME);
        db = devOpenHelper.getReadableDatabase();
        daoMaster = new DaoMaster(db);
        daoSession = daoMaster.newSession();
    }

    public DaoMaster getDaoMaster(){
        return daoMaster;
    }

    public DaoSession getDaoSession(){
        return daoSession;
    }
}

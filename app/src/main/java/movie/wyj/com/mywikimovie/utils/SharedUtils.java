package movie.wyj.com.mywikimovie.utils;

import android.content.Context;

import movie.wyj.com.mywikimovie.base.BaseShared;
import movie.wyj.com.mywikimovie.base.MyApp;

/**
 * Created by TP-PC on 2018.11.30.
 */

public class SharedUtils extends BaseShared {

    private static SharedUtils sharedUtils;

    protected SharedUtils(Context context) {
        super(context);
    }

    /**
     * 需要 key 就在这里新建 ↓
     */
    //   判断登录
    private String USER_ISLOGIN = "isLogins";
    //   sessionId
    private String USER_SESSIONID = "sessionIds";
    //   userId
    private String USER_USERID = "userId";
    // birthday
    private String USER_BIRTHDAY = "birthday";
    //nickName
    private String USER_NICKNAME = "nickName";
    //phone
    private String USER_PHONE = "userphone";
    //sex
    private String USER_SEX = "sex";
    //headPic
    private String USER__HEADPIC = "headPic";
    // pwd
    private String USER_PWD = "pwd";
    // 记住密码
    private String USER_RE = "re";
    //自动登录
    private String USER_AUTO = "auto";


    /**
     * 这里我通过自定义的Application来获取Context对象，所以在获取preferenceUtils时不需要传入Context。
     *
     * @return
     */
    private Context context;

    public synchronized static SharedUtils getInstance() {

        if (null == sharedUtils) {
            sharedUtils = new SharedUtils(MyApp.getContext());
        }
        return sharedUtils;
    }


    /**
     * @param isLogin
     */
    public void setisLogin(boolean isLogin) {
        setBoolean(USER_ISLOGIN, isLogin);
    }

    public boolean getisLogin() {
        return getBoolean(USER_ISLOGIN);
    }

    /**
     * @param sessionId
     */
    public void setsessionId(String sessionId) {
        setString(USER_SESSIONID, sessionId);
    }

    public String getsessionId() {
        return getString(USER_SESSIONID);
    }

    /**
     * @param userId
     */
    public void setUserId(String userId) {
        setString(USER_USERID, userId);
    }

    public String getUserId() {
        return getString(USER_USERID);
    }

    /**
     * @param birthday
     */
    public void setBirthday(String birthday) {
        setString(USER_BIRTHDAY, birthday);
    }

    public String getBirthday() {
        return getString(USER_BIRTHDAY);
    }

    /**
     * @param nickName
     */
    public void setNickName(String nickName) {
        setString(USER_NICKNAME, nickName);
    }

    public String getNickName() {
        return getString(USER_NICKNAME);
    }

    /**
     * @param phone
     */
    public void setPhone(String phone) {
        setString(USER_PHONE, phone);
    }

    public String getPhone() {
        return getString(USER_PHONE);
    }

    /**
     * @param sex
     */
    public void setSex(int sex) {
        setInt(USER_SEX, sex);
    }

    public int getSex() {
        return getInt(USER_SEX);
    }

    /**
     * @param headPic
     */
    public void setHeadPic(String headPic) {
        setString(USER__HEADPIC, headPic);
    }

    public String getHeadPic() {
        return getString(USER__HEADPIC);
    }

    /**
     * @param pwd
     */
    public void setPwd(String pwd) {
        setString(USER_PWD, pwd);
    }

    public String getPwd() {
        return getString(USER_PWD);
    }

    /**
     * @param re
     */
    public void setRem(boolean re) {
        setBoolean(USER_RE, re);
    }

    public boolean getRem() {
        return getBoolean(USER_RE);
    }

    /**
     * @param auto
     */
    public void setAuto(boolean auto) {
        setBoolean(USER_AUTO, auto);
    }

    public boolean getAuto() {
        return getBoolean(USER_AUTO);
    }

}

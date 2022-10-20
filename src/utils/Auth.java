package utils;

import model.NhanVien;

public class Auth {
    //  Duy trì user đăng nhập vào hệ thống
    public static NhanVien user = null;

    public static void clear() {
        Auth.user = null;
    }
    public static boolean isLogin() {
        return Auth.user != null;
    }
    public static boolean isManager() {
        return Auth.isLogin() && user.getVaiTro(0);
    }
}

package com.laanaoui.jee.digital.banking.security.utilities;

public class JWTUtil {
    public static final String SECRET = "K$74Xv2zSb3%8iHlm9q@X&ZQPu$wJp";
    public static final String AUTH_HEADER = "Authorization";
    public static final long EXPIRE_ACCESS_TOKEN = 60 * 60 * 1000;
    public static final long EXPIRE_REFRESH_TOKEN = 480 * 60 * 1000;
    public static final String PREFIX = "Bearer ";
}

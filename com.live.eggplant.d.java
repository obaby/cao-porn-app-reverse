package com.live.eggplant.d;

import c.e.a.e;
import cn.jiguang.net.HttpUtils;
import com.hello.regular.App;
import com.live.eggplant.base.HttpClient;
import com.live.eggplant.base.helper.FileHelper;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;

public class o {
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00f6, code lost:
        r2.append(r12);
        r2.append(a(r7));
        r2.append("\n");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0109, code lost:
        if (r7.contains(".m3u8") == false) goto L_0x011f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x011e, code lost:
        return a(r0 + r7, r12);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.live.eggplant.m3u8.a a(java.lang.String r11, java.lang.String r12) throws java.io.IOException {
        /*
            java.net.URL r0 = new java.net.URL
            r0.<init>(r11)
            java.net.URLConnection r11 = r0.openConnection()
            java.net.HttpURLConnection r11 = (java.net.HttpURLConnection) r11
            com.hello.regular.App r0 = com.hello.regular.App.k()
            java.lang.String r0 = com.live.eggplant.base.HttpClient.getBaseUrl(r0)
            java.net.URI r0 = java.net.URI.create(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r0.getScheme()
            r1.append(r2)
            java.lang.String r2 = "://"
            r1.append(r2)
            java.lang.String r0 = r0.getHost()
            r1.append(r0)
            java.lang.String r0 = "/"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "Referer"
            r11.setRequestProperty(r2, r1)
            int r1 = r11.getResponseCode()
            java.lang.String r2 = ""
            r3 = 200(0xc8, float:2.8E-43)
            if (r1 != r3) goto L_0x0152
            java.net.URL r1 = r11.getURL()
            java.lang.String r1 = r1.toString()
            int r0 = r1.lastIndexOf(r0)
            int r0 = r0 + 1
            r3 = 0
            java.lang.String r0 = r1.substring(r3, r0)
            com.live.eggplant.m3u8.a r1 = new com.live.eggplant.m3u8.a
            r1.<init>()
            r1.a((java.lang.String) r0)
            java.lang.String r4 = com.live.eggplant.base.encrypt.EncryptUtils.getVideoKv()
            java.lang.String r4 = f.a.a.a.a(r4)
            java.io.InputStream r11 = r11.getInputStream()
            byte[] r11 = com.live.eggplant.d.u.a((java.io.InputStream) r11)
            byte[] r11 = com.live.eggplant.base.encrypt.AESUtils.decryptByte(r4, r11)     // Catch:{ Exception -> 0x007d }
            java.lang.String r5 = new java.lang.String     // Catch:{ Exception -> 0x007d }
            r5.<init>(r11)     // Catch:{ Exception -> 0x007d }
            r2 = r5
            goto L_0x0081
        L_0x007d:
            r11 = move-exception
            r11.printStackTrace()
        L_0x0081:
            java.io.BufferedReader r11 = new java.io.BufferedReader
            java.io.StringReader r5 = new java.io.StringReader
            r5.<init>(r2)
            r11.<init>(r5)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r5 = 0
        L_0x0091:
            r6 = 0
        L_0x0092:
            java.lang.String r7 = r11.readLine()
            if (r7 == 0) goto L_0x0129
            java.lang.String r8 = "#"
            boolean r8 = r7.startsWith(r8)
            java.lang.String r9 = "\n"
            if (r8 == 0) goto L_0x00f6
            java.lang.String r8 = "#EXTINF:"
            boolean r8 = r7.startsWith(r8)
            if (r8 == 0) goto L_0x00cd
            r2.append(r7)
            r2.append(r9)
            r6 = 8
            java.lang.String r6 = r7.substring(r6)
            java.lang.String r7 = ","
            boolean r7 = r6.endsWith(r7)
            if (r7 == 0) goto L_0x00c8
            int r7 = r6.length()
            int r7 = r7 + -1
            java.lang.String r6 = r6.substring(r3, r7)
        L_0x00c8:
            float r6 = java.lang.Float.parseFloat(r6)
            goto L_0x0092
        L_0x00cd:
            java.lang.String r8 = "#EXT-X-KEY"
            boolean r8 = r7.startsWith(r8)
            if (r8 == 0) goto L_0x00ef
            java.lang.String r8 = b(r7)
            r1.b(r8)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r12)
            r10.append(r8)
            java.lang.String r10 = r10.toString()
            java.lang.String r7 = r7.replace(r8, r10)
        L_0x00ef:
            r2.append(r7)
            r2.append(r9)
            goto L_0x0092
        L_0x00f6:
            r2.append(r12)
            java.lang.String r8 = a(r7)
            r2.append(r8)
            r2.append(r9)
            java.lang.String r8 = ".m3u8"
            boolean r8 = r7.contains(r8)
            if (r8 == 0) goto L_0x011f
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r0)
            r11.append(r7)
            java.lang.String r11 = r11.toString()
            com.live.eggplant.m3u8.a r11 = a(r11, r12)
            return r11
        L_0x011f:
            com.live.eggplant.m3u8.b r8 = new com.live.eggplant.m3u8.b
            r8.<init>(r7, r6)
            r1.a((com.live.eggplant.m3u8.b) r8)
            goto L_0x0091
        L_0x0129:
            r11.close()
            java.lang.String r11 = r2.toString()     // Catch:{ Exception -> 0x014d }
            byte[] r11 = r11.getBytes()     // Catch:{ Exception -> 0x014d }
            byte[] r11 = com.live.eggplant.base.encrypt.AESUtils.encryptByte(r4, r11)     // Catch:{ Exception -> 0x014d }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x014d }
            r0.<init>()     // Catch:{ Exception -> 0x014d }
            r0.append(r12)     // Catch:{ Exception -> 0x014d }
            java.lang.String r12 = "index.m3u8"
            r0.append(r12)     // Catch:{ Exception -> 0x014d }
            java.lang.String r12 = r0.toString()     // Catch:{ Exception -> 0x014d }
            com.live.eggplant.base.helper.FileHelper.write((java.lang.String) r12, (byte[]) r11)     // Catch:{ Exception -> 0x014d }
            goto L_0x0151
        L_0x014d:
            r11 = move-exception
            r11.printStackTrace()
        L_0x0151:
            return r1
        L_0x0152:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            int r11 = r11.getResponseCode()
            r12.append(r11)
            r12.append(r2)
            r12.toString()
            r11 = 0
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.live.eggplant.d.o.a(java.lang.String, java.lang.String):com.live.eggplant.m3u8.a");
    }

    private static String a(String str) {
        return str.contains(".ts?") ? str.substring(0, str.lastIndexOf("?")) : str;
    }

    public static void a(String str, String str2, String str3) throws IOException {
        if (FileHelper.isFileExists(str)) {
            e.c("key已存在，不进行下载");
            return;
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str2 + str).openConnection();
        URI create = URI.create(HttpClient.getBaseUrl(App.k()));
        httpURLConnection.setRequestProperty("Referer", create.getScheme() + "://" + create.getHost() + HttpUtils.PATHS_SEPARATOR);
        if (httpURLConnection.getResponseCode() == 200) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                } else {
                    FileHelper.write(str3, sb.toString());
                    bufferedReader.close();
                    return;
                }
            }
        }
    }

    private static String b(String str) {
        try {
            for (String str2 : str.split(",")) {
                if (str2.contains("URI")) {
                    return str2.split(HttpUtils.EQUAL_SIGN)[1].replaceAll("\"", "");
                }
            }
        } catch (Exception e) {
            e.getMessage();
        }
        return "";
    }
}
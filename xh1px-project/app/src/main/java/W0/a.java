package W0;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* loaded from: classes.dex */
public final class a implements Closeable {

    /* renamed from: d, reason: collision with root package name */
    public final HttpURLConnection f6479d;

    public a(HttpURLConnection httpURLConnection) {
        this.f6479d = httpURLConnection;
    }

    public final String a() {
        HttpURLConnection httpURLConnection = this.f6479d;
        boolean z8 = false;
        try {
            if (httpURLConnection.getResponseCode() / 100 == 2) {
                z8 = true;
            }
        } catch (IOException unused) {
        }
        if (z8) {
            return null;
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to fetch ");
            sb.append(httpURLConnection.getURL());
            sb.append(". Failed with ");
            sb.append(httpURLConnection.getResponseCode());
            sb.append("\n");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        sb2.append(readLine);
                        sb2.append('\n');
                    } else {
                        try {
                            break;
                        } catch (Exception unused2) {
                        }
                    }
                } catch (Throwable th) {
                    try {
                        bufferedReader.close();
                    } catch (Exception unused3) {
                    }
                    throw th;
                }
            }
            bufferedReader.close();
            sb.append(sb2.toString());
            return sb.toString();
        } catch (IOException e9) {
            Z0.c.c("get error failed ", e9);
            return e9.getMessage();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f6479d.disconnect();
    }
}

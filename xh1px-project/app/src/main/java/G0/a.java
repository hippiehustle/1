package G0;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final HashMap f1688e = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1689a;

    /* renamed from: b, reason: collision with root package name */
    public final File f1690b;

    /* renamed from: c, reason: collision with root package name */
    public final Lock f1691c;

    /* renamed from: d, reason: collision with root package name */
    public FileChannel f1692d;

    public a(String str, File file, boolean z8) {
        File file2;
        Lock lock;
        this.f1689a = z8;
        if (file != null) {
            file2 = new File(file, str.concat(".lck"));
        } else {
            file2 = null;
        }
        this.f1690b = file2;
        HashMap hashMap = f1688e;
        synchronized (hashMap) {
            try {
                Object obj = hashMap.get(str);
                if (obj == null) {
                    obj = new ReentrantLock();
                    hashMap.put(str, obj);
                }
                lock = (Lock) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f1691c = lock;
    }

    public final void a(boolean z8) {
        this.f1691c.lock();
        if (z8) {
            File file = this.f1690b;
            try {
                if (file != null) {
                    File parentFile = file.getParentFile();
                    if (parentFile != null) {
                        parentFile.mkdirs();
                    }
                    FileChannel channel = new FileOutputStream(file).getChannel();
                    channel.lock();
                    this.f1692d = channel;
                    return;
                }
                throw new IOException("No lock directory was provided.");
            } catch (IOException e9) {
                this.f1692d = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e9);
            }
        }
    }

    public final void b() {
        try {
            FileChannel fileChannel = this.f1692d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f1691c.unlock();
    }
}

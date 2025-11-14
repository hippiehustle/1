package r0;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f14222a;

    /* renamed from: b, reason: collision with root package name */
    public final d f14223b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f14224c;

    /* renamed from: d, reason: collision with root package name */
    public final File f14225d;

    /* renamed from: e, reason: collision with root package name */
    public final String f14226e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f14227f = false;

    /* renamed from: g, reason: collision with root package name */
    public c[] f14228g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f14229h;

    public b(AssetManager assetManager, Executor executor, d dVar, String str, File file) {
        byte[] bArr;
        this.f14222a = executor;
        this.f14223b = dVar;
        this.f14226e = str;
        this.f14225d = file;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 31) {
            bArr = e.f14242d;
        } else {
            switch (i4) {
                case 24:
                case 25:
                    bArr = e.f14246h;
                    break;
                case 26:
                    bArr = e.f14245g;
                    break;
                case 27:
                    bArr = e.f14244f;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = e.f14243e;
                    break;
                default:
                    bArr = null;
                    break;
            }
        }
        this.f14224c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e9) {
            String message = e9.getMessage();
            if (message != null) {
                message.contains("compressed");
                return null;
            }
            return null;
        }
    }

    public final void b(final int i4, final Serializable serializable) {
        this.f14222a.execute(new Runnable() { // from class: r0.a
            @Override // java.lang.Runnable
            public final void run() {
                b.this.f14223b.E(i4, serializable);
            }
        });
    }
}

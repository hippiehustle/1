package N0;

import android.content.Context;
import android.util.Pair;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;
import t7.C1594d;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3615a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f3616b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f3617c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f3618d;

    public /* synthetic */ k(Context context, String str, String str2, int i4) {
        this.f3615a = i4;
        this.f3616b = context;
        this.f3617c = str;
        this.f3618d = str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0053, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0059, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d1, code lost:
    
        if (r0 != null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00f0, code lost:
    
        if ((r0.getResponseCode() / 100) == 2) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0124, code lost:
    
        if (0 == 0) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009f  */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, t7.d] */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object call() {
        Context context;
        String str;
        String str2;
        W0.d dVar;
        boolean z8;
        W0.a aVar;
        C0202j c0202j;
        C c6;
        HttpURLConnection httpURLConnection;
        C0202j c0202j2;
        Pair pair;
        C g8;
        File l6;
        W0.b bVar;
        W0.c cVar;
        switch (this.f3615a) {
            case 0:
                context = this.f3616b;
                str = this.f3617c;
                str2 = this.f3618d;
                W0.d dVar2 = D2.f.f869a;
                if (dVar2 == null) {
                    synchronized (W0.d.class) {
                        try {
                            dVar2 = D2.f.f869a;
                            if (dVar2 == null) {
                                Context applicationContext = context.getApplicationContext();
                                W0.c cVar2 = D2.f.f870b;
                                if (cVar2 == null) {
                                    synchronized (W0.c.class) {
                                        cVar = D2.f.f870b;
                                        if (cVar == null) {
                                            cVar = new W0.c(0, new B1.b(3, applicationContext));
                                            D2.f.f870b = cVar;
                                        }
                                    }
                                    cVar2 = cVar;
                                }
                                dVar2 = new W0.d(cVar2, (C1594d) new Object());
                                D2.f.f869a = dVar2;
                            }
                        } finally {
                        }
                    }
                }
                dVar = dVar2;
                z8 = true;
                aVar = null;
                if (str2 != null) {
                    try {
                        l6 = ((W0.c) dVar.f6489e).l(str);
                    } catch (FileNotFoundException unused) {
                    }
                    if (l6 != null) {
                        FileInputStream fileInputStream = new FileInputStream(l6);
                        if (l6.getAbsolutePath().endsWith(".zip")) {
                            bVar = W0.b.f6481f;
                        } else if (l6.getAbsolutePath().endsWith(".gz")) {
                            bVar = W0.b.f6482g;
                        } else {
                            bVar = W0.b.f6480e;
                        }
                        l6.getAbsolutePath();
                        Z0.c.a();
                        pair = new Pair(bVar, fileInputStream);
                        if (pair != null) {
                            W0.b bVar2 = (W0.b) pair.first;
                            InputStream inputStream = (InputStream) pair.second;
                            int ordinal = bVar2.ordinal();
                            if (ordinal != 1) {
                                if (ordinal != 2) {
                                    g8 = o.d(inputStream, str2);
                                } else {
                                    try {
                                        g8 = o.d(new GZIPInputStream(inputStream), str2);
                                    } catch (IOException e9) {
                                        g8 = new C(e9);
                                    }
                                }
                            } else {
                                g8 = o.g(context, new ZipInputStream(inputStream), str2);
                            }
                            c0202j = g8.f3564a;
                            break;
                        }
                    }
                    pair = null;
                    if (pair != null) {
                    }
                }
                c0202j = null;
                if (c0202j != null) {
                    c6 = new C(c0202j);
                } else {
                    Z0.c.a();
                    Z0.c.a();
                    try {
                        try {
                            aVar = C1594d.k(str);
                            httpURLConnection = aVar.f6479d;
                            try {
                                break;
                            } catch (IOException unused2) {
                                break;
                            }
                        } catch (Exception e10) {
                            c6 = new C(e10);
                            break;
                        }
                    } finally {
                    }
                }
                if (str2 != null && (c0202j2 = c6.f3564a) != null) {
                    S0.g.f5201b.f5202a.j(str2, c0202j2);
                }
                return c6;
            default:
                return o.b(this.f3616b, this.f3617c, this.f3618d);
        }
        z8 = false;
        if (z8) {
            c6 = dVar.i(context, str, httpURLConnection.getInputStream(), httpURLConnection.getContentType(), str2);
            C0202j c0202j3 = c6.f3564a;
            Z0.c.a();
        } else {
            c6 = new C(new IllegalArgumentException(aVar.a()));
        }
        try {
            aVar.close();
        } catch (IOException e11) {
            Z0.c.c("LottieFetchResult close failed ", e11);
        }
        if (str2 != null) {
            S0.g.f5201b.f5202a.j(str2, c0202j2);
        }
        return c6;
    }
}

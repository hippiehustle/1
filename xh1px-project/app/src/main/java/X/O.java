package X;

import android.os.Build;
import e6.EnumC0646a;
import f6.AbstractC0713c;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class O implements InterfaceC0333a {

    /* renamed from: a, reason: collision with root package name */
    public final File f6684a;

    /* renamed from: b, reason: collision with root package name */
    public final b0 f6685b;

    /* renamed from: c, reason: collision with root package name */
    public final M1.e f6686c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f6687d;

    /* renamed from: e, reason: collision with root package name */
    public final U7.c f6688e;

    public O(File file, b0 b0Var, M1.e eVar) {
        o6.j.e(b0Var, "coordinator");
        this.f6684a = file;
        this.f6685b = b0Var;
        this.f6686c = eVar;
        this.f6687d = new AtomicBoolean(false);
        this.f6688e = new U7.c();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(8:5|6|7|(1:(3:10|11|12)(2:32|33))(2:34|(7:36|37|38|40|41|42|(1:44)(1:45))(2:54|55))|13|14|15|(2:(1:18)|19)(1:21)))|57|6|7|(0)(0)|13|14|15|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
    
        r1 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0077 A[Catch: all -> 0x0078, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0078, blocks: (B:21:0x0077, B:31:0x0084, B:28:0x0087, B:27:0x007f), top: B:7:0x001e, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v14, types: [X.O] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.M, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.O] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r6v0, types: [S3.h] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(S3.h hVar, AbstractC0713c abstractC0713c) {
        ?? r02;
        int i4;
        J j;
        Throwable th;
        boolean z8;
        O o7;
        try {
            if (abstractC0713c instanceof M) {
                M m6 = (M) abstractC0713c;
                int i8 = m6.f6678l;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    m6.f6678l = i8 - Integer.MIN_VALUE;
                    r02 = m6;
                    Object obj = r02.j;
                    i4 = r02.f6678l;
                    if (i4 == 0) {
                        if (i4 == 1) {
                            hVar = r02.f6677i;
                            j = r02.f6676h;
                            r02 = r02.f6675g;
                            try {
                                Z5.a.d(obj);
                                o7 = r02;
                                z8 = hVar;
                            } catch (Throwable th2) {
                                th = th2;
                                try {
                                    j.close();
                                } catch (Throwable th3) {
                                    Z5.a.a(th, th3);
                                }
                                throw th;
                            }
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        Z5.a.d(obj);
                        if (!this.f6687d.get()) {
                            boolean e9 = this.f6688e.e();
                            try {
                                j = new J(this.f6684a);
                                try {
                                    Boolean valueOf = Boolean.valueOf(e9);
                                    r02.f6675g = this;
                                    r02.f6676h = j;
                                    r02.f6677i = e9;
                                    r02.f6678l = 1;
                                    Object j5 = hVar.j(j, valueOf, r02);
                                    EnumC0646a enumC0646a = EnumC0646a.f10656d;
                                    if (j5 == enumC0646a) {
                                        return enumC0646a;
                                    }
                                    obj = j5;
                                    z8 = e9;
                                    o7 = this;
                                } catch (Throwable th4) {
                                    th = th4;
                                    hVar = e9;
                                    r02 = this;
                                    j.close();
                                    throw th;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                hVar = e9;
                                r02 = this;
                                if (hVar != 0) {
                                    r02.f6688e.a(null);
                                }
                                throw th;
                            }
                        } else {
                            throw new IllegalStateException("StorageConnection has already been disposed.");
                        }
                    }
                    j.close();
                    th = null;
                    if (th != null) {
                        if (z8) {
                            o7.f6688e.a(null);
                        }
                        return obj;
                    }
                    throw th;
                }
            }
            if (i4 == 0) {
            }
            j.close();
            th = null;
            if (th != null) {
            }
        } catch (Throwable th6) {
            th = th6;
            if (hVar != 0) {
            }
            throw th;
        }
        r02 = new M(this, abstractC0713c);
        Object obj2 = r02.j;
        i4 = r02.f6678l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d9 A[Catch: all -> 0x0114, IOException -> 0x0117, TRY_ENTER, TryCatch #8 {IOException -> 0x0117, all -> 0x0114, blocks: (B:18:0x00d9, B:20:0x00df, B:22:0x00e7, B:25:0x00f3, B:26:0x0113, B:28:0x00ec, B:31:0x0120, B:41:0x012a, B:38:0x012d), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0120 A[Catch: all -> 0x0114, IOException -> 0x0117, TRY_ENTER, TRY_LEAVE, TryCatch #8 {IOException -> 0x0117, all -> 0x0114, blocks: (B:18:0x00d9, B:20:0x00df, B:22:0x00e7, B:25:0x00f3, B:26:0x0113, B:28:0x00ec, B:31:0x0120, B:41:0x012a, B:38:0x012d), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, java.io.File] */
    /* JADX WARN: Type inference failed for: r7v2, types: [X.J, X.Q, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(G g8, AbstractC0713c abstractC0713c) {
        N n3;
        File file;
        EnumC0646a enumC0646a;
        U7.a aVar;
        O o7;
        InterfaceC1164c interfaceC1164c;
        ?? j;
        Throwable th;
        Q q6;
        U7.a aVar2;
        O o8;
        File file2;
        boolean renameTo;
        try {
            try {
                try {
                    try {
                        if (abstractC0713c instanceof N) {
                            n3 = (N) abstractC0713c;
                            int i4 = n3.f6683m;
                            if ((i4 & Integer.MIN_VALUE) != 0) {
                                n3.f6683m = i4 - Integer.MIN_VALUE;
                                Object obj = n3.k;
                                file = n3.f6683m;
                                enumC0646a = EnumC0646a.f10656d;
                                if (file == 0) {
                                    if (file != 1) {
                                        if (file == 2) {
                                            q6 = n3.j;
                                            File file3 = (File) n3.f6681i;
                                            aVar2 = (U7.a) n3.f6680h;
                                            o8 = n3.f6679g;
                                            try {
                                                Z5.a.d(obj);
                                                file2 = file3;
                                                try {
                                                    q6.close();
                                                    th = null;
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                }
                                                if (th != null) {
                                                    if (file2.exists()) {
                                                        File file4 = o8.f6684a;
                                                        if (Build.VERSION.SDK_INT >= 26) {
                                                            renameTo = F.a.d(file2, file4);
                                                        } else {
                                                            renameTo = file2.renameTo(file4);
                                                        }
                                                        if (!renameTo) {
                                                            throw new IOException("Unable to rename " + file2 + " to " + o8.f6684a + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                                        }
                                                    }
                                                    aVar2.a(null);
                                                    return Z5.y.f7506a;
                                                }
                                                throw th;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                try {
                                                    q6.close();
                                                } catch (Throwable th4) {
                                                    Z5.a.a(th, th4);
                                                }
                                                throw th;
                                            }
                                        }
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    U7.a aVar3 = (U7.a) n3.f6681i;
                                    InterfaceC1164c interfaceC1164c2 = (InterfaceC1164c) n3.f6680h;
                                    o7 = n3.f6679g;
                                    Z5.a.d(obj);
                                    aVar = aVar3;
                                    interfaceC1164c = interfaceC1164c2;
                                } else {
                                    Z5.a.d(obj);
                                    if (!this.f6687d.get()) {
                                        File file5 = this.f6684a;
                                        File parentFile = file5.getCanonicalFile().getParentFile();
                                        if (parentFile != null) {
                                            parentFile.mkdirs();
                                            if (!parentFile.isDirectory()) {
                                                throw new IOException("Unable to create parent directories of " + file5);
                                            }
                                        }
                                        n3.f6679g = this;
                                        n3.f6680h = g8;
                                        aVar = this.f6688e;
                                        n3.f6681i = aVar;
                                        n3.f6683m = 1;
                                        if (aVar.d(n3) != enumC0646a) {
                                            o7 = this;
                                            interfaceC1164c = g8;
                                        }
                                        return enumC0646a;
                                    }
                                    throw new IllegalStateException("StorageConnection has already been disposed.");
                                }
                                file = new File(o7.f6684a.getAbsolutePath() + ".tmp");
                                j = new J(file);
                                n3.f6679g = o7;
                                n3.f6680h = aVar;
                                n3.f6681i = file;
                                n3.j = j;
                                n3.f6683m = 2;
                                if (interfaceC1164c.l(j, n3) != enumC0646a) {
                                    aVar2 = aVar;
                                    o8 = o7;
                                    q6 = j;
                                    file2 = file;
                                    q6.close();
                                    th = null;
                                    if (th != null) {
                                    }
                                }
                                return enumC0646a;
                            }
                        }
                        n3.f6679g = o7;
                        n3.f6680h = aVar;
                        n3.f6681i = file;
                        n3.j = j;
                        n3.f6683m = 2;
                        if (interfaceC1164c.l(j, n3) != enumC0646a) {
                        }
                        return enumC0646a;
                    } catch (Throwable th5) {
                        th = th5;
                        q6 = j;
                        q6.close();
                        throw th;
                    }
                    j = new J(file);
                } catch (IOException e9) {
                    e = e9;
                    if (file.exists()) {
                        file.delete();
                    }
                    throw e;
                }
                file = new File(o7.f6684a.getAbsolutePath() + ".tmp");
            } catch (Throwable th6) {
                th = th6;
                aVar.a(null);
                throw th;
            }
            if (file == 0) {
            }
        } catch (IOException e10) {
            e = e10;
            aVar = 2;
        } catch (Throwable th7) {
            th = th7;
            aVar = 2;
            aVar.a(null);
            throw th;
        }
        n3 = new N(this, abstractC0713c);
        Object obj2 = n3.k;
        file = n3.f6683m;
        enumC0646a = EnumC0646a.f10656d;
    }

    @Override // X.InterfaceC0333a
    public final void close() {
        this.f6687d.set(true);
        this.f6686c.a();
    }
}

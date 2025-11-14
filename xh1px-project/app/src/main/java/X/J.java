package X;

import a0.C0407b;
import a0.C0412g;
import e6.EnumC0646a;
import f6.AbstractC0713c;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class J implements InterfaceC0333a {

    /* renamed from: a, reason: collision with root package name */
    public final File f6668a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f6669b = new AtomicBoolean(false);

    public J(File file) {
        this.f6668a = file;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(6:5|6|7|(1:(1:(5:11|12|13|14|15)(2:25|26))(3:27|28|29))(2:40|(6:44|45|46|47|(1:49)|50)(2:42|43))|30|31))|69|6|7|(0)(0)|30|31|(3:(1:21)|(1:36)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0070, code lost:
    
        r9 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v9, types: [X.J] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object a(J j, AbstractC0713c abstractC0713c) {
        I i4;
        ?? r12;
        Throwable th;
        Closeable closeable;
        FileInputStream fileInputStream;
        Throwable th2;
        if (abstractC0713c instanceof I) {
            i4 = (I) abstractC0713c;
            int i8 = i4.k;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                i4.k = i8 - Integer.MIN_VALUE;
                Object obj = i4.f6667i;
                r12 = i4.k;
                C0412g c0412g = C0412g.f7667a;
                boolean z8 = true;
                EnumC0646a enumC0646a = EnumC0646a.f10656d;
                if (r12 == 0) {
                    if (r12 != 1) {
                        if (r12 == 2) {
                            closeable = (Closeable) i4.f6665g;
                            try {
                                Z5.a.d(obj);
                                h2.a.b(closeable, null);
                                return obj;
                            } catch (Throwable th3) {
                                th = th3;
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fileInputStream = i4.f6666h;
                    r12 = (J) i4.f6665g;
                    try {
                        Z5.a.d(obj);
                    } catch (Throwable th4) {
                        th2 = th4;
                        try {
                            throw th;
                        } finally {
                        }
                    }
                } else {
                    Z5.a.d(obj);
                    if (!j.f6669b.get()) {
                        try {
                            FileInputStream fileInputStream2 = new FileInputStream(j.f6668a);
                            try {
                                i4.f6665g = j;
                                i4.f6666h = fileInputStream2;
                                i4.k = 1;
                                C0407b a3 = c0412g.a(fileInputStream2);
                                if (a3 != enumC0646a) {
                                    fileInputStream = fileInputStream2;
                                    obj = a3;
                                }
                            } catch (Throwable th5) {
                                r12 = j;
                                fileInputStream = fileInputStream2;
                                th2 = th5;
                                throw th;
                            }
                        } catch (FileNotFoundException unused) {
                            if (j.f6668a.exists()) {
                                FileInputStream fileInputStream3 = new FileInputStream(j.f6668a);
                                try {
                                    i4.f6665g = fileInputStream3;
                                    i4.f6666h = null;
                                    i4.k = 2;
                                    C0407b a4 = c0412g.a(fileInputStream3);
                                    if (a4 != enumC0646a) {
                                        obj = a4;
                                        closeable = fileInputStream3;
                                        h2.a.b(closeable, null);
                                        return obj;
                                    }
                                    return enumC0646a;
                                } catch (Throwable th6) {
                                    th = th6;
                                    closeable = fileInputStream3;
                                    throw th;
                                }
                            }
                            return new C0407b(z8);
                        }
                        return enumC0646a;
                    }
                    throw new IllegalStateException("This scope has already been closed.");
                }
                h2.a.b(fileInputStream, null);
                return obj;
            }
        }
        i4 = new I(j, abstractC0713c);
        Object obj2 = i4.f6667i;
        r12 = i4.k;
        C0412g c0412g2 = C0412g.f7667a;
        boolean z82 = true;
        EnumC0646a enumC0646a2 = EnumC0646a.f10656d;
        if (r12 == 0) {
        }
        h2.a.b(fileInputStream, null);
        return obj2;
    }

    @Override // X.InterfaceC0333a
    public final void close() {
        this.f6669b.set(true);
    }
}

package X;

import a0.C0412g;
import e6.EnumC0646a;
import f6.AbstractC0713c;
import java.io.FileOutputStream;

/* loaded from: classes.dex */
public final class Q extends J {
    /* JADX WARN: Removed duplicated region for block: B:26:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj, AbstractC0713c abstractC0713c) {
        P p8;
        int i4;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        if (abstractC0713c instanceof P) {
            p8 = (P) abstractC0713c;
            int i8 = p8.k;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                p8.k = i8 - Integer.MIN_VALUE;
                Object obj2 = p8.f6691i;
                i4 = p8.k;
                Z5.y yVar = Z5.y.f7506a;
                if (i4 == 0) {
                    if (i4 == 1) {
                        fileOutputStream2 = p8.f6690h;
                        fileOutputStream = p8.f6689g;
                        try {
                            Z5.a.d(obj2);
                        } catch (Throwable th) {
                            th = th;
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                h2.a.b(fileOutputStream, th);
                                throw th2;
                            }
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    Z5.a.d(obj2);
                    if (!this.f6669b.get()) {
                        FileOutputStream fileOutputStream3 = new FileOutputStream(this.f6668a);
                        try {
                            C0412g c0412g = C0412g.f7667a;
                            e0 e0Var = new e0(fileOutputStream3);
                            p8.f6689g = fileOutputStream3;
                            p8.f6690h = fileOutputStream3;
                            p8.k = 1;
                            c0412g.b(obj, e0Var);
                            EnumC0646a enumC0646a = EnumC0646a.f10656d;
                            if (yVar == enumC0646a) {
                                return enumC0646a;
                            }
                            fileOutputStream2 = fileOutputStream3;
                            fileOutputStream = fileOutputStream2;
                        } catch (Throwable th3) {
                            th = th3;
                            fileOutputStream = fileOutputStream3;
                            throw th;
                        }
                    } else {
                        throw new IllegalStateException("This scope has already been closed.");
                    }
                }
                fileOutputStream2.getFD().sync();
                h2.a.b(fileOutputStream, null);
                return yVar;
            }
        }
        p8 = new P(this, abstractC0713c);
        Object obj22 = p8.f6691i;
        i4 = p8.k;
        Z5.y yVar2 = Z5.y.f7506a;
        if (i4 == 0) {
        }
        fileOutputStream2.getFD().sync();
        h2.a.b(fileOutputStream, null);
        return yVar2;
    }
}

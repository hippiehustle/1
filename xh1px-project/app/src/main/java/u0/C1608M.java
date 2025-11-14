package u0;

import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import java.util.concurrent.locks.ReentrantLock;
import n6.InterfaceC1164c;

/* renamed from: u0.M, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1608M extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f15191h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f15192i;
    public final /* synthetic */ C1609N j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1608M(C1609N c1609n, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.j = c1609n;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C1608M) p((InterfaceC0617c) obj2, (z) obj)).v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        C1608M c1608m = new C1608M(this.j, interfaceC0617c);
        c1608m.f15192i = obj;
        return c1608m;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0035, code lost:
    
        if (r6 == r5) goto L48;
     */
    @Override // f6.AbstractC0711a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        z zVar;
        Object b4;
        EnumC1620k[] enumC1620kArr;
        EnumC1620k enumC1620k;
        int i4 = this.f15191h;
        Z5.y yVar = Z5.y.f7506a;
        boolean z8 = true;
        EnumC0646a enumC0646a = EnumC0646a.f10656d;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    Z5.a.d(obj);
                    return yVar;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zVar = (z) this.f15192i;
            Z5.a.d(obj);
            b4 = obj;
        } else {
            Z5.a.d(obj);
            zVar = (z) this.f15192i;
            this.f15192i = zVar;
            this.f15191h = 1;
            b4 = zVar.b(this);
        }
        if (!((Boolean) b4).booleanValue()) {
            C1609N c1609n = this.j;
            C1621l c1621l = c1609n.f15201h;
            long[] jArr = (long[]) c1621l.f15245f;
            ReentrantLock reentrantLock = (ReentrantLock) c1621l.f15244e;
            reentrantLock.lock();
            try {
                if (!c1621l.f15243d) {
                    reentrantLock.unlock();
                    enumC1620kArr = null;
                } else {
                    boolean z9 = false;
                    c1621l.f15243d = false;
                    int length = jArr.length;
                    enumC1620kArr = new EnumC1620k[length];
                    int i8 = 0;
                    boolean z10 = false;
                    while (i8 < length) {
                        if (jArr[i8] <= 0) {
                            z8 = z9;
                        }
                        boolean[] zArr = (boolean[]) c1621l.f15246g;
                        if (z8 != zArr[i8]) {
                            zArr[i8] = z8;
                            if (z8) {
                                enumC1620k = EnumC1620k.f15240e;
                            } else {
                                enumC1620k = EnumC1620k.f15241f;
                            }
                            z10 = true;
                        } else {
                            enumC1620k = EnumC1620k.f15239d;
                        }
                        enumC1620kArr[i8] = enumC1620k;
                        i8++;
                        z8 = true;
                        z9 = false;
                    }
                    if (!z10) {
                        enumC1620kArr = null;
                    }
                    reentrantLock.unlock();
                }
                if (enumC1620kArr != null) {
                    C1607L c1607l = new C1607L(enumC1620kArr, c1609n, zVar, null);
                    this.f15192i = null;
                    this.f15191h = 2;
                    if (zVar.d(y.f15293e, c1607l, this) == enumC0646a) {
                        return enumC0646a;
                    }
                }
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        return yVar;
    }
}

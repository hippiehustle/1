package u0;

import O7.InterfaceC0234g;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.KotlinNothingValueException;
import n6.InterfaceC1164c;

/* renamed from: u0.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1599D extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f15154h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f15155i;
    public final /* synthetic */ C1609N j;
    public final /* synthetic */ int[] k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String[] f15156l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1599D(C1609N c1609n, int[] iArr, String[] strArr, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.j = c1609n;
        this.k = iArr;
        this.f15156l = strArr;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        ((C1599D) p((InterfaceC0617c) obj2, (InterfaceC0234g) obj)).v(Z5.y.f7506a);
        return EnumC0646a.f10656d;
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        C1599D c1599d = new C1599D(this.j, this.k, this.f15156l, interfaceC0617c);
        c1599d.f15155i = obj;
        return c1599d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0099, code lost:
    
        if (L7.AbstractC0166y.A((d6.InterfaceC0622h) r6, r9, r20) == r8) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x009b, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0087, code lost:
    
        if (r6 == r8) goto L32;
     */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, o6.u] */
    @Override // f6.AbstractC0711a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        InterfaceC0234g interfaceC0234g;
        Object q6;
        int i4 = this.f15154h;
        int[] iArr = this.k;
        C1609N c1609n = this.j;
        EnumC0646a enumC0646a = EnumC0646a.f10656d;
        try {
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Z5.a.d(obj);
                        throw new KotlinNothingValueException();
                    }
                    interfaceC0234g = (InterfaceC0234g) this.f15155i;
                    Z5.a.d(obj);
                    ?? obj2 = new Object();
                    C1.f fVar = c1609n.f15202i;
                    P7.l lVar = new P7.l((o6.u) obj2, interfaceC0234g, this.f15156l, iArr);
                    this.f15155i = null;
                    this.f15154h = 3;
                    fVar.a(lVar, this);
                    return enumC0646a;
                }
                interfaceC0234g = (InterfaceC0234g) this.f15155i;
                Z5.a.d(obj);
                q6 = obj;
                C1597B c1597b = new C1597B(c1609n, null);
                this.f15155i = interfaceC0234g;
                this.f15154h = 2;
            } else {
                Z5.a.d(obj);
                interfaceC0234g = (InterfaceC0234g) this.f15155i;
                C1621l c1621l = c1609n.f15201h;
                c1621l.getClass();
                o6.j.e(iArr, "tableIds");
                ((ReentrantLock) c1621l.f15244e).lock();
                try {
                    boolean z8 = false;
                    for (int i8 : iArr) {
                        long[] jArr = (long[]) c1621l.f15245f;
                        long j = jArr[i8];
                        jArr[i8] = j + 1;
                        if (j == 0) {
                            z8 = true;
                            c1621l.f15243d = true;
                        }
                    }
                    if (z8) {
                        u uVar = c1609n.f15194a;
                        this.f15155i = interfaceC0234g;
                        this.f15154h = 1;
                        q6 = D2.f.q(uVar, false, this);
                    }
                    ?? obj22 = new Object();
                    C1.f fVar2 = c1609n.f15202i;
                    P7.l lVar2 = new P7.l((o6.u) obj22, interfaceC0234g, this.f15156l, iArr);
                    this.f15155i = null;
                    this.f15154h = 3;
                    fVar2.a(lVar2, this);
                    return enumC0646a;
                } finally {
                }
            }
        } catch (Throwable th) {
            C1621l c1621l2 = c1609n.f15201h;
            c1621l2.getClass();
            o6.j.e(iArr, "tableIds");
            ((ReentrantLock) c1621l2.f15244e).lock();
            try {
                for (int i9 : iArr) {
                    long[] jArr2 = (long[]) c1621l2.f15245f;
                    long j5 = jArr2[i9];
                    jArr2[i9] = j5 - 1;
                    if (j5 == 1) {
                        c1621l2.f15243d = true;
                    }
                }
                throw th;
            } finally {
            }
        }
    }
}

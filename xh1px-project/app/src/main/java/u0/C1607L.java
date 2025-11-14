package u0;

import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import kotlin.NoWhenBranchMatchedException;
import n6.InterfaceC1164c;

/* renamed from: u0.L, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1607L extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public EnumC1620k[] f15183h;

    /* renamed from: i, reason: collision with root package name */
    public C1609N f15184i;
    public z j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public int f15185l;

    /* renamed from: m, reason: collision with root package name */
    public int f15186m;

    /* renamed from: n, reason: collision with root package name */
    public int f15187n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ EnumC1620k[] f15188o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C1609N f15189p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ z f15190q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1607L(EnumC1620k[] enumC1620kArr, C1609N c1609n, z zVar, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f15188o = enumC1620kArr;
        this.f15189p = c1609n;
        this.f15190q = zVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C1607L) p((InterfaceC0617c) obj2, (w0.r) obj)).v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C1607L(this.f15188o, this.f15189p, this.f15190q, interfaceC0617c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0072, code lost:
    
        if (u0.C1609N.c(r6, r5, r11, r10) == r9) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
    
        r4 = r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0078  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0075 -> B:10:0x0076). Please report as a decompilation issue!!! */
    @Override // f6.AbstractC0711a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        int length;
        int i4;
        z zVar;
        EnumC1620k[] enumC1620kArr;
        int i8;
        C1609N c1609n;
        int i9 = this.f15187n;
        if (i9 != 0) {
            if (i9 == 1 || i9 == 2) {
                length = this.f15186m;
                i4 = this.f15185l;
                int i10 = this.k;
                zVar = this.j;
                c1609n = this.f15184i;
                enumC1620kArr = this.f15183h;
                Z5.a.d(obj);
                i8 = i10;
                i4++;
                if (i4 >= length) {
                    int i11 = i8 + 1;
                    int ordinal = enumC1620kArr[i4].ordinal();
                    if (ordinal != 0) {
                        EnumC0646a enumC0646a = EnumC0646a.f10656d;
                        if (ordinal != 1) {
                            if (ordinal == 2) {
                                this.f15183h = enumC1620kArr;
                                this.f15184i = c1609n;
                                this.j = zVar;
                                this.k = i11;
                                this.f15185l = i4;
                                this.f15186m = length;
                                this.f15187n = 2;
                                if (C1609N.d(c1609n, zVar, i8, this) != enumC0646a) {
                                    i10 = i11;
                                    i8 = i10;
                                }
                                return enumC0646a;
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        this.f15183h = enumC1620kArr;
                        this.f15184i = c1609n;
                        this.j = zVar;
                        this.k = i11;
                        this.f15185l = i4;
                        this.f15186m = length;
                        this.f15187n = 1;
                        i4++;
                        if (i4 >= length) {
                            return Z5.y.f7506a;
                        }
                    } else {
                        i8 = i11;
                        i4++;
                        if (i4 >= length) {
                        }
                    }
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            EnumC1620k[] enumC1620kArr2 = this.f15188o;
            length = enumC1620kArr2.length;
            i4 = 0;
            C1609N c1609n2 = this.f15189p;
            zVar = this.f15190q;
            enumC1620kArr = enumC1620kArr2;
            i8 = 0;
            c1609n = c1609n2;
            if (i4 >= length) {
            }
        }
    }
}

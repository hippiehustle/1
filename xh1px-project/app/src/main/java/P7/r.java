package P7;

import L7.AbstractC0166y;
import L7.InterfaceC0163v;
import O7.InterfaceC0233f;
import O7.InterfaceC0234g;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import n6.InterfaceC1164c;
import n6.InterfaceC1165d;

/* loaded from: classes.dex */
public final class r extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public N7.l f4674h;

    /* renamed from: i, reason: collision with root package name */
    public byte[] f4675i;
    public int j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public int f4676l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f4677m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0233f[] f4678n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ AbstractC0720j f4679o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0234g f4680p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public r(InterfaceC0234g interfaceC0234g, InterfaceC0617c interfaceC0617c, InterfaceC1165d interfaceC1165d, InterfaceC0233f[] interfaceC0233fArr) {
        super(2, interfaceC0617c);
        this.f4678n = interfaceC0233fArr;
        this.f4679o = (AbstractC0720j) interfaceC1165d;
        this.f4680p = interfaceC0234g;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((r) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(Z5.y.f7506a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [f6.j, n6.d] */
    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        r rVar = new r(this.f4680p, interfaceC0617c, this.f4679o, this.f4678n);
        rVar.f4677m = obj;
        return rVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x008e, code lost:
    
        if (r11 == r7) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0099, code lost:
    
        if (r11 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009e, code lost:
    
        r12 = r11.f7769a;
        r13 = r10[r12];
        r10[r12] = r11.f7770b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a6, code lost:
    
        if (r13 != r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a8, code lost:
    
        r3 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ac, code lost:
    
        if (r8[r12] == r2) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ae, code lost:
    
        r8[r12] = (byte) r2;
        r11 = r9.l();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b7, code lost:
    
        if ((r11 instanceof N7.n) != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ba, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00bb, code lost:
    
        r11 = (a6.v) r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00bd, code lost:
    
        if (r11 != null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00bf, code lost:
    
        if (r3 != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c1, code lost:
    
        r17.f4677m = r10;
        r17.f4674h = r9;
        r17.f4675i = r8;
        r17.j = r3;
        r17.k = r2;
        r17.f4676l = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d5, code lost:
    
        if (r17.f4679o.j(r17.f4680p, r10, r17) != r7) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007c, code lost:
    
        if (r3 != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d7, code lost:
    
        return r7;
     */
    /* JADX WARN: Type inference failed for: r11v11, types: [f6.j, n6.d] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00d5 -> B:10:0x007c). Please report as a decompilation issue!!! */
    @Override // f6.AbstractC0711a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        byte[] bArr;
        N7.l lVar;
        int i4;
        Object[] objArr;
        int i8;
        Object obj2;
        Q7.t tVar = AbstractC0285b.f4641c;
        int i9 = this.f4676l;
        EnumC0646a enumC0646a = EnumC0646a.f10656d;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 == 2 || i9 == 3) {
                    i8 = this.k;
                    i4 = this.j;
                    bArr = this.f4675i;
                    lVar = this.f4674h;
                    objArr = (Object[]) this.f4677m;
                    Z5.a.d(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                i8 = this.k;
                i4 = this.j;
                bArr = this.f4675i;
                lVar = this.f4674h;
                objArr = (Object[]) this.f4677m;
                Z5.a.d(obj);
                obj2 = ((N7.o) obj).f3841a;
                if (obj2 instanceof N7.n) {
                    obj2 = null;
                }
                a6.v vVar = (a6.v) obj2;
            }
        } else {
            Z5.a.d(obj);
            InterfaceC0163v interfaceC0163v = (InterfaceC0163v) this.f4677m;
            InterfaceC0233f[] interfaceC0233fArr = this.f4678n;
            int length = interfaceC0233fArr.length;
            if (length != 0) {
                Object[] objArr2 = new Object[length];
                int i10 = 0;
                Arrays.fill(objArr2, 0, length, tVar);
                N7.h H2 = E2.c.H(length, 6, null);
                AtomicInteger atomicInteger = new AtomicInteger(length);
                int i11 = 0;
                while (i11 < length) {
                    AbstractC0166y.q(interfaceC0163v, null, null, new q(interfaceC0233fArr, i11, atomicInteger, H2, null), 3);
                    i11++;
                    i10 = i10;
                }
                int i12 = i10;
                bArr = new byte[length];
                lVar = H2;
                i4 = length;
                objArr = objArr2;
                i8 = i12;
            }
            return Z5.y.f7506a;
        }
        i8 = (byte) (i8 + 1);
        this.f4677m = objArr;
        this.f4674h = lVar;
        this.f4675i = bArr;
        this.j = i4;
        this.k = i8;
        this.f4676l = 1;
        obj2 = lVar.c(this);
    }
}

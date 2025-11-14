package q2;

import L7.AbstractC0166y;
import L7.F;
import O7.C0238k;
import Q7.n;
import Z5.y;
import android.accessibilityservice.GestureDescription;
import android.graphics.Path;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import h6.AbstractC0837b;
import i.AbstractC0863b;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import l1.C1000b;
import n6.InterfaceC1163b;
import p2.C1304a;
import r6.C1474e;

/* renamed from: q2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1360f extends AbstractC0720j implements InterfaceC1163b {

    /* renamed from: h, reason: collision with root package name */
    public C1365k f13951h;

    /* renamed from: i, reason: collision with root package name */
    public p2.e f13952i;
    public Iterator j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public int f13953l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p2.e f13954m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C1365k f13955n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1360f(InterfaceC0617c interfaceC0617c, p2.e eVar, C1365k c1365k) {
        super(1, interfaceC0617c);
        this.f13954m = eVar;
        this.f13955n = c1365k;
    }

    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        return new C1360f((InterfaceC0617c) obj, this.f13954m, this.f13955n).v(y.f7506a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x008b, code lost:
    
        if (r3 == r11) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008e, code lost:
    
        r3 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00e7, code lost:
    
        if (r3 != r11) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c4, code lost:
    
        if (r3 == r11) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e5, code lost:
    
        if (r3 == r11) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0123, code lost:
    
        if (r1 == r11) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f6  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00e7 -> B:11:0x00ea). Please report as a decompilation issue!!! */
    @Override // f6.AbstractC0711a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        Iterator it;
        p2.e eVar;
        int i4;
        C1365k c1365k;
        boolean hasNext;
        Object obj2;
        Object g8;
        int i8 = this.f13953l;
        C1365k c1365k2 = this.f13955n;
        y yVar = y.f7506a;
        int i9 = 1;
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 == 2) {
                    Z5.a.d(obj);
                    return yVar;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i4 = this.k;
            it = this.j;
            eVar = this.f13952i;
            c1365k = this.f13951h;
            Z5.a.d(obj);
            y yVar2 = yVar;
            yVar = yVar2;
            i9 = 1;
            hasNext = it.hasNext();
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (hasNext) {
                p2.d dVar = (p2.d) it.next();
                C1357c c1357c = c1365k.f13963b;
                boolean z8 = eVar.f13706h;
                this.f13951h = c1365k;
                this.f13952i = eVar;
                this.j = it;
                this.k = i4;
                this.f13953l = i9;
                C1474e c1474e = c1357c.f13944b;
                if (dVar instanceof C1304a) {
                    C1304a c1304a = (C1304a) dVar;
                    GestureDescription.Builder builder = new GestureDescription.Builder();
                    Path path = new Path();
                    AbstractC0837b.p(path, c1304a.f13683h, c1474e);
                    yVar2 = yVar;
                    g8 = AbstractC0863b.s(c1304a, new C0238k(c1357c, AbstractC0837b.c(builder, path, c1304a.f13684i, c1474e), null, 2), this);
                    if (g8 != enumC0646a) {
                        g8 = yVar2;
                    }
                    if (g8 != enumC0646a) {
                        g8 = yVar2;
                    }
                } else {
                    yVar2 = yVar;
                    if (dVar instanceof p2.c) {
                        p2.c cVar = (p2.c) dVar;
                        GestureDescription.Builder builder2 = new GestureDescription.Builder();
                        Path path2 = new Path();
                        AbstractC0837b.o(path2, cVar.f13697h, cVar.f13698i, c1474e);
                        g8 = AbstractC0863b.s(cVar, new C0238k(c1357c, AbstractC0837b.c(builder2, path2, cVar.j, c1474e), null, 2), this);
                        if (g8 != enumC0646a) {
                            g8 = yVar2;
                        }
                        if (g8 != enumC0646a) {
                            g8 = yVar2;
                        }
                    } else if (dVar instanceof p2.b) {
                        long j = ((p2.b) dVar).f13689e;
                        if (c1474e != null) {
                            j = c1474e.f(j - 5, j + 6);
                        }
                        g8 = AbstractC0166y.g(j, this);
                        if (g8 != enumC0646a) {
                            g8 = yVar2;
                        }
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                hasNext = it.hasNext();
                EnumC0646a enumC0646a2 = EnumC0646a.f10656d;
                if (hasNext) {
                    y yVar3 = yVar;
                    C1357c c1357c2 = c1365k2.f13963b;
                    this.f13951h = null;
                    this.f13952i = null;
                    this.j = null;
                    this.f13953l = 2;
                    C1000b c1000b = c1357c2.f13946d;
                    if (c1000b != null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (currentTimeMillis >= c1000b.f12189a + 10000) {
                            c1000b.f12189a = currentTimeMillis;
                            S7.e eVar2 = F.f3175a;
                            obj2 = AbstractC0166y.A(n.f4962a, new C1356b(c1357c2, null), this);
                        }
                    }
                    obj2 = yVar3;
                    if (obj2 != enumC0646a2) {
                        return yVar3;
                    }
                }
            }
            return enumC0646a2;
        }
        Z5.a.d(obj);
        p2.e eVar3 = this.f13954m;
        it = eVar3.f13701c.iterator();
        eVar = eVar3;
        i4 = 0;
        c1365k = c1365k2;
        hasNext = it.hasNext();
        EnumC0646a enumC0646a22 = EnumC0646a.f10656d;
        if (hasNext) {
        }
        return enumC0646a22;
    }
}

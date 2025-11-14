package H4;

import A1.h;
import L7.AbstractC0166y;
import L7.InterfaceC0163v;
import O7.i0;
import Z5.y;
import a6.t;
import android.graphics.Rect;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import java.util.Objects;
import n6.InterfaceC1164c;
import o6.j;

/* loaded from: classes.dex */
public final class b extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f2003h;

    /* renamed from: i, reason: collision with root package name */
    public int f2004i;
    public final /* synthetic */ c j;
    public final /* synthetic */ Rect k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f2005l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ h f2006m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Rect rect, int i4, h hVar, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.j = cVar;
        this.k = rect;
        this.f2005l = i4;
        this.f2006m = hVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((b) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new b(this.j, this.k, this.f2005l, this.f2006m, interfaceC0617c);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0057  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0069 -> B:5:0x006c). Please report as a decompilation issue!!! */
    @Override // f6.AbstractC0711a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        int i4;
        c cVar = this.j;
        i0 i0Var = cVar.f2011e;
        i0 i0Var2 = cVar.f2010d;
        i0 i0Var3 = cVar.f2008b;
        i0 i0Var4 = cVar.f2009c;
        int i8 = this.f2004i;
        boolean z8 = false;
        if (i8 != 0) {
            if (i8 == 1) {
                i4 = this.f2003h;
                Z5.a.d(obj);
                Integer num = new Integer(i4);
                i0Var2.getClass();
                i0Var2.h(null, num);
                cVar.b(i4);
                i4--;
                if (-1 < i4) {
                    int i9 = J7.a.f2503g;
                    long l6 = J7.f.l(1, J7.c.SECONDS);
                    this.f2003h = i4;
                    this.f2004i = 1;
                    Object h8 = AbstractC0166y.h(l6, this);
                    EnumC0646a enumC0646a = EnumC0646a.f10656d;
                    if (h8 == enumC0646a) {
                        return enumC0646a;
                    }
                    Integer num2 = new Integer(i4);
                    i0Var2.getClass();
                    i0Var2.h(null, num2);
                    cVar.b(i4);
                    i4--;
                    if (-1 < i4) {
                        Boolean bool = Boolean.FALSE;
                        i0Var3.getClass();
                        i0Var3.h(null, bool);
                        i0 i0Var5 = cVar.f2013g;
                        i0Var5.getClass();
                        i0Var5.h(null, t.f7767d);
                        if (((Number) i0Var.f()).intValue() > cVar.f2007a) {
                            z8 = true;
                        }
                        Boolean valueOf = Boolean.valueOf(z8);
                        i0Var4.getClass();
                        i0Var4.h(null, valueOf);
                        Objects.toString(i0Var4.f());
                        this.f2006m.m(Boolean.valueOf(j.a(i0Var4.f(), Boolean.TRUE)));
                        return y.f7506a;
                    }
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            Boolean bool2 = Boolean.TRUE;
            i0Var3.getClass();
            i0Var3.h(null, bool2);
            Integer num3 = new Integer(10);
            i0Var2.getClass();
            i0Var2.h(null, num3);
            Integer num4 = new Integer(0);
            i0Var.getClass();
            i0Var.h(null, num4);
            i0Var4.g(null);
            cVar.a(this.f2005l, this.k);
            cVar.b(10);
            i4 = 9;
            if (-1 < i4) {
            }
        }
    }
}

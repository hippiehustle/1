package b3;

import N7.r;
import N7.s;
import Z5.y;
import e6.EnumC0646a;
import f6.AbstractC0713c;
import f6.AbstractC0720j;
import java.util.List;
import n6.InterfaceC1167f;

/* loaded from: classes.dex */
public final class g extends AbstractC0720j implements InterfaceC1167f {

    /* renamed from: h, reason: collision with root package name */
    public int f9130h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ List f9131i;
    public /* synthetic */ List j;
    public /* synthetic */ int k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ boolean f9132l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ s f9133m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(s sVar, AbstractC0713c abstractC0713c) {
        super(5, abstractC0713c);
        this.f9133m = sVar;
    }

    @Override // n6.InterfaceC1167f
    public final Object b(Object obj, Object obj2, Object obj3, Object obj4, AbstractC0713c abstractC0713c) {
        int intValue = ((Number) obj3).intValue();
        boolean booleanValue = ((Boolean) obj4).booleanValue();
        g gVar = new g(this.f9133m, abstractC0713c);
        gVar.f9131i = (List) obj;
        gVar.j = (List) obj2;
        gVar.k = intValue;
        gVar.f9132l = booleanValue;
        return gVar.v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        List list = this.f9131i;
        List list2 = this.j;
        int i4 = this.k;
        boolean z8 = this.f9132l;
        int i8 = this.f9130h;
        if (i8 != 0) {
            if (i8 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            C0530a c0530a = new C0530a(list2.size() + list.size(), i4, z8);
            this.f9131i = null;
            this.j = null;
            this.k = i4;
            this.f9132l = z8;
            this.f9130h = 1;
            Object b4 = ((r) this.f9133m).f3845g.b(this, c0530a);
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (b4 == enumC0646a) {
                return enumC0646a;
            }
        }
        return y.f7506a;
    }
}

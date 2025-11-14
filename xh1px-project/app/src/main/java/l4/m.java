package l4;

import Z5.y;
import android.graphics.Bitmap;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import j2.C0902b;
import java.util.List;
import n6.InterfaceC1165d;
import u6.AbstractC1638C;

/* loaded from: classes.dex */
public final class m extends AbstractC0720j implements InterfaceC1165d {

    /* renamed from: h, reason: collision with root package name */
    public C0902b f12278h;

    /* renamed from: i, reason: collision with root package name */
    public int f12279i;
    public /* synthetic */ int j;
    public /* synthetic */ I3.b k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ q1.e f12280l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(q1.e eVar, InterfaceC0617c interfaceC0617c) {
        super(3, interfaceC0617c);
        this.f12280l = eVar;
    }

    @Override // n6.InterfaceC1165d
    public final Object j(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj).intValue();
        m mVar = new m(this.f12280l, (InterfaceC0617c) obj3);
        mVar.j = intValue;
        mVar.k = (I3.b) obj2;
        return mVar.v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        C0902b c0902b;
        int i4 = this.j;
        I3.b bVar = this.k;
        int i8 = this.f12279i;
        if (i8 != 0) {
            if (i8 == 1) {
                c0902b = this.f12278h;
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            List list = bVar.f2089a;
            if (list == null || i4 < 0 || i4 >= list.size()) {
                return null;
            }
            C0902b c0902b2 = (C0902b) list.get(i4);
            this.k = null;
            this.f12278h = c0902b2;
            this.j = i4;
            this.f12279i = 1;
            Bitmap w8 = AbstractC1638C.w(this.f12280l, c0902b2);
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (w8 == enumC0646a) {
                return enumC0646a;
            }
            c0902b = c0902b2;
            obj = w8;
        }
        return new Z5.j(c0902b, obj);
    }
}

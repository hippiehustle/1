package q2;

import L7.InterfaceC0163v;
import Z5.y;
import android.accessibilityservice.GestureDescription;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;
import r1.C1428b;

/* renamed from: q2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1355a extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f13939h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1357c f13940i;
    public final /* synthetic */ GestureDescription j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1355a(C1357c c1357c, GestureDescription gestureDescription, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f13940i = c1357c;
        this.j = gestureDescription;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C1355a) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C1355a(this.f13940i, this.j, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f13939h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            C1428b c1428b = this.f13940i.f13943a;
            this.f13939h = 1;
            Object a3 = c1428b.a(this.j, this);
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (a3 == enumC0646a) {
                return enumC0646a;
            }
        }
        return y.f7506a;
    }
}

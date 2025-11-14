package y3;

import D4.t;
import L7.InterfaceC0163v;
import O7.P;
import Z5.y;
import com.buzbuz.smartautoclicker.feature.qstile.ui.QSTileService;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import kotlin.KotlinNothingValueException;
import n6.InterfaceC1164c;

/* renamed from: y3.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1839h extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f16511h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ QSTileService f16512i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1839h(QSTileService qSTileService, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f16512i = qSTileService;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        ((C1839h) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
        return EnumC0646a.f10656d;
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C1839h(this.f16512i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f16511h;
        if (i4 != 0) {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Z5.a.d(obj);
            throw new KotlinNothingValueException();
        }
        Z5.a.d(obj);
        QSTileService qSTileService = this.f16512i;
        P p8 = qSTileService.b().f16127h;
        t tVar = new t(22, qSTileService);
        this.f16511h = 1;
        p8.f4088d.x(tVar, this);
        return EnumC0646a.f10656d;
    }
}

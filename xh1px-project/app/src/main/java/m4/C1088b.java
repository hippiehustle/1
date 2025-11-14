package m4;

import Z5.y;
import a6.AbstractC0437l;
import android.content.Context;
import android.view.View;
import com.buzbuz.smartautoclicker.R;
import e2.C0639b;
import j2.AbstractC0901a;
import j2.C0903c;
import j2.C0905e;
import j2.EnumC0904d;
import kotlin.NoWhenBranchMatchedException;
import l1.C0999a;
import l1.C1000b;
import n6.InterfaceC1163b;

/* renamed from: m4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1088b implements InterfaceC1163b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12499d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i f12500e;

    public /* synthetic */ C1088b(i iVar, int i4) {
        this.f12499d = i4;
        this.f12500e = iVar;
    }

    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        j2.g gVar;
        j2.g fVar;
        j2.g gVar2;
        int i4 = this.f12499d;
        int i8 = 3;
        y yVar = y.f7506a;
        i iVar = this.f12500e;
        switch (i4) {
            case 0:
                o6.j.e((View) obj, "it");
                iVar.a();
                return yVar;
            case 1:
                o6.j.e((View) obj, "it");
                iVar.o().d(iVar.k(), new A1.p(R.style.AppTheme, R.string.dialog_title_trigger_condition_type, AbstractC0437l.X(l.f12521d, m.f12522d, n.f12523d), new C1088b(iVar, 4), null), false);
                return yVar;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                o6.j.e((View) obj, "it");
                iVar.o().d(iVar.k(), new j4.f(new C1088b(iVar, i8)), false);
                return yVar;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                AbstractC0901a abstractC0901a = (AbstractC0901a) obj;
                o6.j.e(abstractC0901a, "conditionSelected");
                if (abstractC0901a instanceof j2.g) {
                    gVar = (j2.g) abstractC0901a;
                } else {
                    gVar = null;
                }
                if (gVar != null) {
                    H3.b bVar = iVar.G().f12518b.f1949d;
                    iVar.H(bVar.f(gVar, bVar.h()));
                }
                return yVar;
            default:
                o oVar = (o) obj;
                o6.j.e(oVar, "choice");
                k G8 = iVar.G();
                Context k = iVar.k();
                H3.n nVar = G8.f12518b;
                if (oVar.equals(l.f12521d)) {
                    H3.b bVar2 = nVar.f1949d;
                    bVar2.getClass();
                    C0999a a3 = ((C1000b) bVar2.j).a();
                    C0999a h8 = bVar2.h();
                    ((W0.d) bVar2.f1905h).getClass();
                    gVar2 = new C0903c(a3, h8, W0.d.e(k), "");
                } else {
                    if (oVar.equals(m.f12522d)) {
                        H3.b bVar3 = nVar.f1949d;
                        bVar3.getClass();
                        C0999a a4 = ((C1000b) bVar3.j).a();
                        C0999a h9 = bVar3.h();
                        ((W0.d) bVar3.f1905h).getClass();
                        fVar = new C0905e(a4, h9, W0.d.e(k), "", EnumC0904d.f11802d, new C0639b(0));
                    } else if (oVar.equals(n.f12523d)) {
                        H3.b bVar4 = nVar.f1949d;
                        bVar4.getClass();
                        C0999a a9 = ((C1000b) bVar4.j).a();
                        C0999a h10 = bVar4.h();
                        ((W0.d) bVar4.f1905h).getClass();
                        fVar = new j2.f(a9, h10, W0.d.e(k), 0L, false);
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    gVar2 = fVar;
                }
                iVar.H(gVar2);
                return yVar;
        }
    }
}

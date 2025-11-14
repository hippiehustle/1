package X3;

import O7.InterfaceC0234g;
import android.graphics.Point;
import android.util.Log;
import com.buzbuz.smartautoclicker.R;
import d6.InterfaceC0617c;
import o6.C1282a;
import o6.InterfaceC1288g;
import q4.X;

/* renamed from: X3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0364c implements InterfaceC0234g, InterfaceC1288g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6883d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p f6884e;

    public /* synthetic */ C0364c(p pVar, int i4) {
        this.f6883d = i4;
        this.f6884e = pVar;
    }

    @Override // o6.InterfaceC1288g
    public final Z5.d a() {
        switch (this.f6883d) {
            case 0:
                return new C1282a(2, this.f6884e, p.class, "onActionEditingStateChanged", "onActionEditingStateChanged(Z)V", 4);
            case 1:
                return new C1282a(2, this.f6884e, p.class, "updateClickName", "updateClickName(Ljava/lang/String;)V", 4);
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                return new C1282a(2, this.f6884e, p.class, "updateSwipeDuration", "updateSwipeDuration(Ljava/lang/String;)V", 4);
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                return new C1282a(2, this.f6884e, p.class, "updateSwipePositionsField", "updateSwipePositionsField(Lkotlin/Pair;)V", 4);
            default:
                return new C1282a(2, this.f6884e, p.class, "updateSaveButton", "updateSaveButton(Z)V", 4);
        }
    }

    public final boolean equals(Object obj) {
        switch (this.f6883d) {
            case 0:
                if ((obj instanceof InterfaceC0234g) && (obj instanceof InterfaceC1288g)) {
                    return a().equals(((InterfaceC1288g) obj).a());
                }
                return false;
            case 1:
                if ((obj instanceof InterfaceC0234g) && (obj instanceof InterfaceC1288g)) {
                    return a().equals(((InterfaceC1288g) obj).a());
                }
                return false;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                if ((obj instanceof InterfaceC0234g) && (obj instanceof InterfaceC1288g)) {
                    return a().equals(((InterfaceC1288g) obj).a());
                }
                return false;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                if ((obj instanceof InterfaceC0234g) && (obj instanceof InterfaceC1288g)) {
                    return a().equals(((InterfaceC1288g) obj).a());
                }
                return false;
            default:
                if ((obj instanceof InterfaceC0234g) && (obj instanceof InterfaceC1288g)) {
                    return a().equals(((InterfaceC1288g) obj).a());
                }
                return false;
        }
    }

    public final int hashCode() {
        switch (this.f6883d) {
            case 0:
                return a().hashCode();
            case 1:
                return a().hashCode();
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                return a().hashCode();
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                return a().hashCode();
            default:
                return a().hashCode();
        }
    }

    @Override // O7.InterfaceC0234g
    public final Object n(Object obj, InterfaceC0617c interfaceC0617c) {
        String string;
        int i4 = this.f6883d;
        Z5.y yVar = Z5.y.f7506a;
        p pVar = this.f6884e;
        switch (i4) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                pVar.getClass();
                if (!booleanValue) {
                    Log.e("SwipeDialog", "Closing ClickDialog because there is no action edited");
                    pVar.i();
                }
                return yVar;
            case 1:
                String str = (String) obj;
                A4.d dVar = pVar.f6911w;
                if (dVar != null) {
                    E2.c.y0((A.i) dVar.f296f, str, 1);
                    return yVar;
                }
                o6.j.i("viewBinding");
                throw null;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                String str2 = (String) obj;
                A4.d dVar2 = pVar.f6911w;
                if (dVar2 != null) {
                    A.i iVar = (A.i) dVar2.f298h;
                    o6.j.d(iVar, "fieldSwipeDuration");
                    E2.c.y0(iVar, str2, 2);
                    return yVar;
                }
                o6.j.i("viewBinding");
                throw null;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                Z5.j jVar = (Z5.j) obj;
                A4.d dVar3 = pVar.f6911w;
                if (dVar3 != null) {
                    A4.c cVar = (A4.c) dVar3.f297g;
                    o6.j.d(cVar, "fieldSelectionSwipePosition");
                    if (jVar != null) {
                        Object obj2 = jVar.f7486e;
                        Point point = (Point) jVar.f7485d;
                        Point point2 = (Point) obj2;
                        string = pVar.k().getString(R.string.field_swipe_positions_desc, Integer.valueOf(point.x), Integer.valueOf(point.y), Integer.valueOf(point2.x), Integer.valueOf(point2.y));
                    } else {
                        string = pVar.k().getString(R.string.generic_select_the_position);
                    }
                    E2.c.o0(cVar, string);
                    return yVar;
                }
                o6.j.i("viewBinding");
                throw null;
            default:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                A4.d dVar4 = pVar.f6911w;
                if (dVar4 != null) {
                    X.P((A4.d) dVar4.f299i, booleanValue2);
                    return yVar;
                }
                o6.j.i("viewBinding");
                throw null;
        }
    }
}

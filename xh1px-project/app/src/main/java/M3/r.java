package M3;

import O7.InterfaceC0234g;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import com.buzbuz.smartautoclicker.R;
import com.buzbuz.smartautoclicker.core.ui.views.clickoffset.ClickOffsetView;
import d6.InterfaceC0617c;
import o6.C1282a;
import o6.InterfaceC1288g;

/* loaded from: classes.dex */
public final /* synthetic */ class r implements InterfaceC0234g, InterfaceC1288g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3461d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0190x f3462e;

    public /* synthetic */ r(C0190x c0190x, int i4) {
        this.f3461d = i4;
        this.f3462e = c0190x;
    }

    @Override // o6.InterfaceC1288g
    public final Z5.d a() {
        switch (this.f3461d) {
            case 0:
                return new C1282a(2, this.f3462e, C0190x.class, "updateClickOffset", "updateClickOffset(Lcom/buzbuz/smartautoclicker/feature/smart/config/ui/action/click/ClickOffsetState;)V", 4);
            default:
                return new C1282a(2, this.f3462e, C0190x.class, "updateConditionImage", "updateConditionImage(Landroid/graphics/Bitmap;)V", 4);
        }
    }

    public final boolean equals(Object obj) {
        switch (this.f3461d) {
            case 0:
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
        switch (this.f3461d) {
            case 0:
                return a().hashCode();
            default:
                return a().hashCode();
        }
    }

    @Override // O7.InterfaceC0234g
    public final Object n(Object obj, InterfaceC0617c interfaceC0617c) {
        int i4 = this.f3461d;
        Z5.y yVar = Z5.y.f7506a;
        C0190x c0190x = this.f3462e;
        switch (i4) {
            case 0:
                C0191y c0191y = (C0191y) obj;
                A4.a aVar = (A4.a) c0190x.f3475w;
                if (aVar != null) {
                    EnumC0192z enumC0192z = c0191y.f3477b;
                    Point point = c0191y.f3476a;
                    if (enumC0192z != EnumC0192z.f3480f) {
                        ((ClickOffsetView) aVar.f283h).setOffsetValue(new PointF(point));
                    }
                    if (c0191y.f3477b != EnumC0192z.f3479e) {
                        A4.a aVar2 = (A4.a) c0190x.f3475w;
                        if (aVar2 != null) {
                            A.i iVar = (A.i) aVar2.f281f;
                            o6.j.d(iVar, "fieldX");
                            E2.c.y0(iVar, String.valueOf(point.x), 4098);
                            A4.a aVar3 = (A4.a) c0190x.f3475w;
                            if (aVar3 != null) {
                                A.i iVar2 = (A.i) aVar3.f282g;
                                o6.j.d(iVar2, "fieldY");
                                E2.c.y0(iVar2, String.valueOf(point.y), 4098);
                            } else {
                                o6.j.i("viewBinding");
                                throw null;
                            }
                        } else {
                            o6.j.i("viewBinding");
                            throw null;
                        }
                    }
                    return yVar;
                }
                o6.j.i("viewBinding");
                throw null;
            default:
                Bitmap bitmap = (Bitmap) obj;
                A4.a aVar4 = (A4.a) c0190x.f3475w;
                if (aVar4 != null) {
                    ClickOffsetView clickOffsetView = (ClickOffsetView) aVar4.f283h;
                    if (bitmap != null) {
                        clickOffsetView.setImageBitmap(bitmap);
                    } else {
                        clickOffsetView.setImageResource(R.drawable.ic_image_condition_big);
                    }
                    return yVar;
                }
                o6.j.i("viewBinding");
                throw null;
        }
    }
}

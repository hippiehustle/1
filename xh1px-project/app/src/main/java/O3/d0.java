package O3;

import O7.InterfaceC0234g;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.buzbuz.smartautoclicker.R;
import d1.C0594a;
import d6.InterfaceC0617c;
import o6.C1282a;
import o6.InterfaceC1288g;

/* loaded from: classes.dex */
public final /* synthetic */ class d0 implements InterfaceC0234g, InterfaceC1288g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3951d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k0 f3952e;

    public /* synthetic */ d0(k0 k0Var, int i4) {
        this.f3951d = i4;
        this.f3952e = k0Var;
    }

    @Override // o6.InterfaceC1288g
    public final Z5.d a() {
        switch (this.f3951d) {
            case 0:
                return new C1282a(2, this.f3952e, k0.class, "updateClickName", "updateClickName(Ljava/lang/String;)V", 4);
            default:
                return new C1282a(2, this.f3952e, k0.class, "updateActivityInfo", "updateActivityInfo(Lcom/buzbuz/smartautoclicker/core/android/application/AndroidApplicationInfo;)V", 4);
        }
    }

    public final boolean equals(Object obj) {
        switch (this.f3951d) {
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
        switch (this.f3951d) {
            case 0:
                return a().hashCode();
            default:
                return a().hashCode();
        }
    }

    @Override // O7.InterfaceC0234g
    public final Object n(Object obj, InterfaceC0617c interfaceC0617c) {
        int i4;
        int i8 = this.f3951d;
        Z5.y yVar = Z5.y.f7506a;
        k0 k0Var = this.f3952e;
        switch (i8) {
            case 0:
                String str = (String) obj;
                A4.c cVar = k0Var.f3980m;
                if (cVar != null) {
                    E2.c.y0((A.i) cVar.f292f, str, 1);
                    return yVar;
                }
                o6.j.i("viewBinding");
                throw null;
            default:
                C0594a c0594a = (C0594a) obj;
                A4.c cVar2 = k0Var.f3980m;
                if (cVar2 != null) {
                    A4.c cVar3 = (A4.c) cVar2.f293g;
                    if (c0594a == null) {
                        o6.j.b(cVar3);
                        String string = k0Var.h().getString(R.string.field_application_selection_title);
                        o6.j.d(string, "getString(...)");
                        E2.c.A0(cVar3, string);
                        E2.c.o0(cVar3, k0Var.h().getString(R.string.field_application_selection_desc));
                    } else {
                        o6.j.b(cVar3);
                        Drawable drawable = c0594a.f10366c;
                        ImageView imageView = (ImageView) cVar3.f292f;
                        if (drawable == null) {
                            i4 = 8;
                        } else {
                            i4 = 0;
                        }
                        imageView.setVisibility(i4);
                        imageView.setImageDrawable(drawable);
                        E2.c.A0(cVar3, c0594a.f10365b);
                        E2.c.o0(cVar3, c0594a.f10364a.getPackageName());
                    }
                    return yVar;
                }
                o6.j.i("viewBinding");
                throw null;
        }
    }
}

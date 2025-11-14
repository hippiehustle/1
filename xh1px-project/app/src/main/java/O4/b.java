package O4;

import O7.InterfaceC0234g;
import Z5.y;
import com.buzbuz.smartautoclicker.feature.tutorial.ui.TutorialActivity;
import d6.InterfaceC0617c;

/* loaded from: classes.dex */
public final class b implements InterfaceC0234g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4010d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ TutorialActivity f4011e;

    public /* synthetic */ b(TutorialActivity tutorialActivity, int i4) {
        this.f4010d = i4;
        this.f4011e = tutorialActivity;
    }

    @Override // O7.InterfaceC0234g
    public final Object n(Object obj, InterfaceC0617c interfaceC0617c) {
        int i4 = this.f4010d;
        y yVar = y.f7506a;
        TutorialActivity tutorialActivity = this.f4011e;
        switch (i4) {
            case 0:
                if (((Boolean) obj).booleanValue()) {
                    tutorialActivity.finish();
                }
                return yVar;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                int i8 = TutorialActivity.f9824J;
                C1.g gVar = tutorialActivity.f9831I;
                if (gVar != null) {
                    if (booleanValue) {
                        gVar.g();
                    } else {
                        gVar.b();
                    }
                    tutorialActivity.z().f4031b.a();
                    return yVar;
                }
                o6.j.i("overlayManager");
                throw null;
        }
    }
}

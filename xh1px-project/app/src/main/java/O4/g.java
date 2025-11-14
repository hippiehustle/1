package O4;

import com.buzbuz.smartautoclicker.feature.tutorial.ui.TutorialActivity;
import n6.InterfaceC1162a;

/* loaded from: classes.dex */
public final class g extends o6.l implements InterfaceC1162a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4020e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ TutorialActivity f4021f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(TutorialActivity tutorialActivity, int i4) {
        super(0);
        this.f4020e = i4;
        this.f4021f = tutorialActivity;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f4020e) {
            case 0:
                return this.f4021f.d();
            case 1:
                return this.f4021f.f();
            default:
                return this.f4021f.e();
        }
    }
}

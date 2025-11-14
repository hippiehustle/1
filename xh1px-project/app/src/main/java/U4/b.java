package U4;

import com.buzbuz.smartautoclicker.scenarios.ScenarioActivity;
import n6.InterfaceC1162a;
import o6.l;

/* loaded from: classes.dex */
public final class b extends l implements InterfaceC1162a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f6160e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ScenarioActivity f6161f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(ScenarioActivity scenarioActivity, int i4) {
        super(0);
        this.f6160e = i4;
        this.f6161f = scenarioActivity;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f6160e) {
            case 0:
                return this.f6161f.d();
            case 1:
                return this.f6161f.f();
            default:
                return this.f6161f.e();
        }
    }
}

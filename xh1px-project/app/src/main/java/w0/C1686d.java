package w0;

import com.buzbuz.smartautoclicker.SmartAutoClickerService;
import com.buzbuz.smartautoclicker.feature.qstile.ui.QSTileLauncherActivity;
import n6.InterfaceC1162a;
import t0.C1536c;
import y3.C1838g;

/* renamed from: w0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1686d implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15574d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f15575e;

    public /* synthetic */ C1686d(int i4, Object obj) {
        this.f15574d = i4;
        this.f15575e = obj;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        int i4 = this.f15574d;
        Object obj = this.f15575e;
        switch (i4) {
            case 0:
                return ((C1536c) obj).b(":memory:");
            case 1:
                int i8 = QSTileLauncherActivity.f9796I;
                ((QSTileLauncherActivity) obj).finish();
                return Z5.y.f7506a;
            default:
                W5.a aVar = ((C1838g) obj).f16505c.f16126g;
                boolean z8 = false;
                if (aVar != null) {
                    ((SmartAutoClickerService) aVar.f6634e).f9747g.getClass();
                    if (T4.l.f5788b != null) {
                        z8 = true;
                    }
                }
                return Boolean.valueOf(z8);
        }
    }
}

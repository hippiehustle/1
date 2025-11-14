package y3;

import com.buzbuz.smartautoclicker.feature.qstile.ui.QSTileLauncherActivity;
import n6.InterfaceC1162a;
import o6.l;

/* renamed from: y3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1834c extends l implements InterfaceC1162a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f16497e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ QSTileLauncherActivity f16498f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1834c(QSTileLauncherActivity qSTileLauncherActivity, int i4) {
        super(0);
        this.f16497e = i4;
        this.f16498f = qSTileLauncherActivity;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f16497e) {
            case 0:
                return this.f16498f.d();
            case 1:
                return this.f16498f.f();
            default:
                return this.f16498f.e();
        }
    }
}

package h4;

import com.buzbuz.smartautoclicker.feature.smart.config.ui.common.starters.RestartMediaProjectionActivity;
import n6.InterfaceC1162a;
import o6.l;

/* renamed from: h4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0828b extends l implements InterfaceC1162a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f11363e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ RestartMediaProjectionActivity f11364f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0828b(RestartMediaProjectionActivity restartMediaProjectionActivity, int i4) {
        super(0);
        this.f11363e = i4;
        this.f11364f = restartMediaProjectionActivity;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f11363e) {
            case 0:
                return this.f11364f.d();
            case 1:
                return this.f11364f.f();
            default:
                return this.f11364f.e();
        }
    }
}

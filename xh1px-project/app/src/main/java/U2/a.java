package U2;

import A.i;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public final class a implements M0.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6082d;

    /* renamed from: e, reason: collision with root package name */
    public final FrameLayout f6083e;

    /* renamed from: f, reason: collision with root package name */
    public final i f6084f;

    public /* synthetic */ a(FrameLayout frameLayout, i iVar, int i4) {
        this.f6082d = i4;
        this.f6083e = frameLayout;
        this.f6084f = iVar;
    }

    @Override // M0.a
    public final View getRoot() {
        switch (this.f6082d) {
            case 0:
                return this.f6083e;
            default:
                return this.f6083e;
        }
    }
}

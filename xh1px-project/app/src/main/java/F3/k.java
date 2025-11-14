package F3;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;

/* loaded from: classes.dex */
public final class k implements M0.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1361d;

    /* renamed from: e, reason: collision with root package name */
    public final FrameLayout f1362e;

    /* renamed from: f, reason: collision with root package name */
    public final ImageButton f1363f;

    /* renamed from: g, reason: collision with root package name */
    public final ImageButton f1364g;

    /* renamed from: h, reason: collision with root package name */
    public final ImageButton f1365h;

    /* renamed from: i, reason: collision with root package name */
    public final ImageButton f1366i;
    public final ImageButton j;

    public /* synthetic */ k(FrameLayout frameLayout, ImageButton imageButton, ImageButton imageButton2, ImageButton imageButton3, ImageButton imageButton4, ImageButton imageButton5, int i4) {
        this.f1361d = i4;
        this.f1362e = frameLayout;
        this.f1363f = imageButton;
        this.f1364g = imageButton2;
        this.f1365h = imageButton3;
        this.f1366i = imageButton4;
        this.j = imageButton5;
    }

    @Override // M0.a
    public final View getRoot() {
        switch (this.f1361d) {
            case 0:
                return this.f1362e;
            default:
                return this.f1362e;
        }
    }
}

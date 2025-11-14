package K3;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.material.textview.MaterialTextView;

/* renamed from: K3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0093g implements M0.a {

    /* renamed from: d, reason: collision with root package name */
    public final FrameLayout f2677d;

    /* renamed from: e, reason: collision with root package name */
    public final ImageView f2678e;

    /* renamed from: f, reason: collision with root package name */
    public final MaterialTextView f2679f;

    /* renamed from: g, reason: collision with root package name */
    public final MaterialTextView f2680g;

    /* renamed from: h, reason: collision with root package name */
    public final ImageView f2681h;

    public C0093g(FrameLayout frameLayout, ImageView imageView, MaterialTextView materialTextView, MaterialTextView materialTextView2, ImageView imageView2) {
        this.f2677d = frameLayout;
        this.f2678e = imageView;
        this.f2679f = materialTextView;
        this.f2680g = materialTextView2;
        this.f2681h = imageView2;
    }

    @Override // M0.a
    public final View getRoot() {
        return this.f2677d;
    }
}

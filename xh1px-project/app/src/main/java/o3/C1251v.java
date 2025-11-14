package o3;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.material.textview.MaterialTextView;

/* renamed from: o3.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1251v implements M0.a {

    /* renamed from: d, reason: collision with root package name */
    public final FrameLayout f13496d;

    /* renamed from: e, reason: collision with root package name */
    public final MaterialTextView f13497e;

    /* renamed from: f, reason: collision with root package name */
    public final MaterialTextView f13498f;

    /* renamed from: g, reason: collision with root package name */
    public final MaterialTextView f13499g;

    /* renamed from: h, reason: collision with root package name */
    public final ImageView f13500h;

    public C1251v(FrameLayout frameLayout, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3, ImageView imageView) {
        this.f13496d = frameLayout;
        this.f13497e = materialTextView;
        this.f13498f = materialTextView2;
        this.f13499g = materialTextView3;
        this.f13500h = imageView;
    }

    @Override // M0.a
    public final View getRoot() {
        return this.f13496d;
    }
}

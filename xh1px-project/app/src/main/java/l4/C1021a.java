package l4;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.material.textview.MaterialTextView;

/* renamed from: l4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1021a implements M0.a {

    /* renamed from: d, reason: collision with root package name */
    public final FrameLayout f12250d;

    /* renamed from: e, reason: collision with root package name */
    public final ImageView f12251e;

    /* renamed from: f, reason: collision with root package name */
    public final MaterialTextView f12252f;

    /* renamed from: g, reason: collision with root package name */
    public final MaterialTextView f12253g;

    /* renamed from: h, reason: collision with root package name */
    public final ImageView f12254h;

    /* renamed from: i, reason: collision with root package name */
    public final MaterialTextView f12255i;
    public final ImageView j;

    public C1021a(FrameLayout frameLayout, ImageView imageView, MaterialTextView materialTextView, MaterialTextView materialTextView2, ImageView imageView2, MaterialTextView materialTextView3, ImageView imageView3) {
        this.f12250d = frameLayout;
        this.f12251e = imageView;
        this.f12252f = materialTextView;
        this.f12253g = materialTextView2;
        this.f12254h = imageView2;
        this.f12255i = materialTextView3;
        this.j = imageView3;
    }

    @Override // M0.a
    public final View getRoot() {
        return this.f12250d;
    }
}

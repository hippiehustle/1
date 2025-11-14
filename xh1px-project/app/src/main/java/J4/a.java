package J4;

import A.i;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public final class a implements M0.a {

    /* renamed from: d, reason: collision with root package name */
    public final ConstraintLayout f2483d;

    /* renamed from: e, reason: collision with root package name */
    public final AppCompatImageView f2484e;

    /* renamed from: f, reason: collision with root package name */
    public final MaterialButton f2485f;

    /* renamed from: g, reason: collision with root package name */
    public final i f2486g;

    /* renamed from: h, reason: collision with root package name */
    public final MaterialCardView f2487h;

    /* renamed from: i, reason: collision with root package name */
    public final AppCompatImageView f2488i;
    public final MaterialCardView j;
    public final MaterialTextView k;

    /* renamed from: l, reason: collision with root package name */
    public final MaterialTextView f2489l;

    /* renamed from: m, reason: collision with root package name */
    public final MaterialTextView f2490m;

    public a(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, MaterialButton materialButton, i iVar, MaterialCardView materialCardView, AppCompatImageView appCompatImageView2, MaterialCardView materialCardView2, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3) {
        this.f2483d = constraintLayout;
        this.f2484e = appCompatImageView;
        this.f2485f = materialButton;
        this.f2486g = iVar;
        this.f2487h = materialCardView;
        this.f2488i = appCompatImageView2;
        this.j = materialCardView2;
        this.k = materialTextView;
        this.f2489l = materialTextView2;
        this.f2490m = materialTextView3;
    }

    @Override // M0.a
    public final View getRoot() {
        return this.f2483d;
    }
}

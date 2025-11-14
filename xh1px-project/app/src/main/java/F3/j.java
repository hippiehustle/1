package F3;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public final class j implements M0.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1355d;

    /* renamed from: e, reason: collision with root package name */
    public final ConstraintLayout f1356e;

    /* renamed from: f, reason: collision with root package name */
    public final ImageView f1357f;

    /* renamed from: g, reason: collision with root package name */
    public final MaterialTextView f1358g;

    /* renamed from: h, reason: collision with root package name */
    public final ImageView f1359h;

    /* renamed from: i, reason: collision with root package name */
    public final MaterialTextView f1360i;

    public /* synthetic */ j(ConstraintLayout constraintLayout, ImageView imageView, MaterialTextView materialTextView, ImageView imageView2, MaterialTextView materialTextView2, int i4) {
        this.f1355d = i4;
        this.f1356e = constraintLayout;
        this.f1357f = imageView;
        this.f1358g = materialTextView;
        this.f1359h = imageView2;
        this.f1360i = materialTextView2;
    }

    @Override // M0.a
    public final View getRoot() {
        switch (this.f1355d) {
            case 0:
                return this.f1356e;
            default:
                return this.f1356e;
        }
    }
}

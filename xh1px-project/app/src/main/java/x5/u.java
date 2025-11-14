package x5;

import android.widget.ImageButton;

/* loaded from: classes.dex */
public abstract class u extends ImageButton {

    /* renamed from: d, reason: collision with root package name */
    public int f16224d;

    public final void a(int i4, boolean z8) {
        super.setVisibility(i4);
        if (z8) {
            this.f16224d = i4;
        }
    }

    public final int getUserSetVisibility() {
        return this.f16224d;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i4) {
        a(i4, true);
    }
}

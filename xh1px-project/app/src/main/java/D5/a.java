package D5;

import android.graphics.Typeface;
import g0.L;
import q4.X;
import x5.C1792b;

/* loaded from: classes.dex */
public final class a extends X {

    /* renamed from: e, reason: collision with root package name */
    public final Typeface f1001e;

    /* renamed from: f, reason: collision with root package name */
    public final L f1002f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1003g;

    public a(L l6, Typeface typeface) {
        super(4);
        this.f1001e = typeface;
        this.f1002f = l6;
    }

    @Override // q4.X
    public final void F(int i4) {
        if (!this.f1003g) {
            C1792b c1792b = (C1792b) this.f1002f.f10871e;
            if (c1792b.j(this.f1001e)) {
                c1792b.h(false);
            }
        }
    }

    @Override // q4.X
    public final void G(Typeface typeface, boolean z8) {
        if (!this.f1003g) {
            C1792b c1792b = (C1792b) this.f1002f.f10871e;
            if (c1792b.j(typeface)) {
                c1792b.h(false);
            }
        }
    }
}

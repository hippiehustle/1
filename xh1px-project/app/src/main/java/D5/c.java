package D5;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import q4.X;

/* loaded from: classes.dex */
public final class c extends X {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f1006e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ TextPaint f1007f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ X f1008g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ d f1009h;

    public c(d dVar, Context context, TextPaint textPaint, X x8) {
        super(4);
        this.f1009h = dVar;
        this.f1006e = context;
        this.f1007f = textPaint;
        this.f1008g = x8;
    }

    @Override // q4.X
    public final void F(int i4) {
        this.f1008g.F(i4);
    }

    @Override // q4.X
    public final void G(Typeface typeface, boolean z8) {
        this.f1009h.g(this.f1006e, this.f1007f, typeface);
        this.f1008g.G(typeface, z8);
    }
}

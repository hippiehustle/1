package x5;

import android.content.Context;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: c, reason: collision with root package name */
    public float f16211c;

    /* renamed from: d, reason: collision with root package name */
    public float f16212d;

    /* renamed from: f, reason: collision with root package name */
    public final WeakReference f16214f;

    /* renamed from: g, reason: collision with root package name */
    public D5.d f16215g;

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f16209a = new TextPaint(1);

    /* renamed from: b, reason: collision with root package name */
    public final q5.b f16210b = new q5.b(1, this);

    /* renamed from: e, reason: collision with root package name */
    public boolean f16213e = true;

    public m(l lVar) {
        this.f16214f = new WeakReference(null);
        this.f16214f = new WeakReference(lVar);
    }

    public final float a(String str) {
        if (!this.f16213e) {
            return this.f16211c;
        }
        b(str);
        return this.f16211c;
    }

    public final void b(String str) {
        float measureText;
        TextPaint textPaint = this.f16209a;
        float f8 = 0.0f;
        if (str == null) {
            measureText = 0.0f;
        } else {
            measureText = textPaint.measureText((CharSequence) str, 0, str.length());
        }
        this.f16211c = measureText;
        if (str != null) {
            f8 = Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.f16212d = f8;
        this.f16213e = false;
    }

    public final void c(D5.d dVar, Context context) {
        if (this.f16215g != dVar) {
            this.f16215g = dVar;
            if (dVar != null) {
                TextPaint textPaint = this.f16209a;
                q5.b bVar = this.f16210b;
                dVar.f(context, textPaint, bVar);
                l lVar = (l) this.f16214f.get();
                if (lVar != null) {
                    textPaint.drawableState = lVar.getState();
                }
                dVar.e(context, textPaint, bVar);
                this.f16213e = true;
            }
            l lVar2 = (l) this.f16214f.get();
            if (lVar2 != null) {
                lVar2.a();
                lVar2.onStateChange(lVar2.getState());
            }
        }
    }
}

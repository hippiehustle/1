package C5;

import android.graphics.Canvas;
import android.graphics.Rect;

/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public i f705a;

    public final void a(Canvas canvas, Rect rect, float f8, boolean z8, boolean z9) {
        boolean z10;
        this.f705a.a();
        e eVar = (e) this;
        float width = rect.width() / eVar.d();
        float height = rect.height() / eVar.d();
        i iVar = eVar.f705a;
        float f9 = (iVar.f683h / 2.0f) + iVar.f684i;
        canvas.translate((f9 * width) + rect.left, (f9 * height) + rect.top);
        canvas.rotate(-90.0f);
        canvas.scale(width, height);
        if (iVar.j != 0) {
            canvas.scale(1.0f, -1.0f);
        }
        float f10 = -f9;
        canvas.clipRect(f10, f10, f9, f9);
        int i4 = iVar.f676a;
        if (i4 / 2 <= iVar.f677b) {
            z10 = true;
        } else {
            z10 = false;
        }
        eVar.f660e = z10;
        eVar.f657b = i4 * f8;
        eVar.f658c = Math.min(r11, r2) * f8;
        int i8 = iVar.f683h;
        int i9 = iVar.f676a;
        float f11 = (i8 - i9) / 2.0f;
        eVar.f659d = f11;
        if (z8 || z9) {
            if ((z8 && iVar.f680e == 2) || (z9 && iVar.f681f == 1)) {
                eVar.f659d = (((1.0f - f8) * i9) / 2.0f) + f11;
            } else if ((z8 && iVar.f680e == 1) || (z9 && iVar.f681f == 2)) {
                eVar.f659d = f11 - (((1.0f - f8) * i9) / 2.0f);
            }
        }
        if (z9 && iVar.f681f == 3) {
            eVar.f661f = f8;
        } else {
            eVar.f661f = 1.0f;
        }
    }
}

package C5;

import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.provider.Settings;
import h4.AbstractC0832f;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class q extends m {

    /* renamed from: o, reason: collision with root package name */
    public e f708o;

    /* renamed from: p, reason: collision with root package name */
    public h f709p;

    /* renamed from: q, reason: collision with root package name */
    public K0.p f710q;

    @Override // C5.m
    public final boolean d(boolean z8, boolean z9, boolean z10) {
        ObjectAnimator objectAnimator;
        K0.p pVar;
        boolean d2 = super.d(z8, z9, z10);
        if (this.f696f != null && Settings.Global.getFloat(this.f694d.getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f && (pVar = this.f710q) != null) {
            return pVar.setVisible(z8, z9);
        }
        if (!isRunning() && (objectAnimator = this.f709p.f669c) != null) {
            objectAnimator.cancel();
        }
        if (z8 && z10) {
            this.f709p.r();
        }
        return d2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z8;
        boolean z9;
        int i4;
        K0.p pVar;
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            a aVar = this.f696f;
            int i8 = 0;
            i iVar = this.f695e;
            if (aVar != null && Settings.Global.getFloat(this.f694d.getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f && (pVar = this.f710q) != null) {
                pVar.setBounds(getBounds());
                this.f710q.setTint(iVar.f678c[0]);
                this.f710q.draw(canvas);
                return;
            }
            canvas.save();
            e eVar = this.f708o;
            Rect bounds = getBounds();
            float b4 = b();
            ObjectAnimator objectAnimator = this.f697g;
            if (objectAnimator != null && objectAnimator.isRunning()) {
                z8 = true;
            } else {
                z8 = false;
            }
            ObjectAnimator objectAnimator2 = this.f698h;
            if (objectAnimator2 != null && objectAnimator2.isRunning()) {
                z9 = true;
            } else {
                z9 = false;
            }
            eVar.a(canvas, bounds, b4, z8, z9);
            int i9 = iVar.f682g;
            int i10 = this.f701m;
            Paint paint = this.f700l;
            if (i9 == 0) {
                e eVar2 = this.f708o;
                int i11 = iVar.f679d;
                eVar2.getClass();
                eVar2.b(canvas, paint, 0.0f, 1.0f, AbstractC0832f.j(i11, i10), 0, 0);
            } else {
                n nVar = (n) ((ArrayList) this.f709p.f707b).get(0);
                ArrayList arrayList = (ArrayList) this.f709p.f707b;
                n nVar2 = (n) arrayList.get(arrayList.size() - 1);
                e eVar3 = this.f708o;
                float f8 = nVar2.f703b;
                float f9 = nVar.f702a + 1.0f;
                int i12 = iVar.f679d;
                eVar3.getClass();
                eVar3.b(canvas, paint, f8, f9, AbstractC0832f.j(i12, 0), i9, i9);
                i10 = 0;
            }
            while (i8 < ((ArrayList) this.f709p.f707b).size()) {
                n nVar3 = (n) ((ArrayList) this.f709p.f707b).get(i8);
                e eVar4 = this.f708o;
                int i13 = this.f701m;
                eVar4.getClass();
                eVar4.b(canvas, paint, nVar3.f702a, nVar3.f703b, AbstractC0832f.j(nVar3.f704c, i13), 0, 0);
                if (i8 > 0 && i9 > 0) {
                    n nVar4 = (n) ((ArrayList) this.f709p.f707b).get(i8 - 1);
                    e eVar5 = this.f708o;
                    float f10 = nVar4.f703b;
                    float f11 = nVar3.f702a;
                    int i14 = iVar.f679d;
                    eVar5.getClass();
                    i4 = i9;
                    eVar5.b(canvas, paint, f10, f11, AbstractC0832f.j(i14, i10), i4, i9);
                } else {
                    i4 = i9;
                }
                i8++;
                i9 = i4;
            }
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f708o.d();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f708o.d();
    }
}

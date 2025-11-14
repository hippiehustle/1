package T2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.buzbuz.smartautoclicker.R;
import o6.j;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f5676a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean[] f5677b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5678c;

    /* renamed from: d, reason: collision with root package name */
    public final Drawable f5679d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5680e;

    public d(Context context, int i4, Rect rect, int i8, boolean[] zArr) {
        this.f5676a = rect;
        this.f5677b = zArr;
        this.f5678c = i4 / 2;
        Drawable drawable = context.getDrawable(i8);
        j.b(drawable);
        drawable.setTint(context.getResources().getColor(R.color.overlayViewPrimary, null));
        Drawable mutate = drawable.mutate();
        j.d(mutate, "mutate(...)");
        this.f5679d = mutate;
    }

    public void a(Canvas canvas) {
        if (this.f5680e) {
            return;
        }
        this.f5679d.draw(canvas);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
    
        if (r4.f5676a.contains(r6.getBounds()) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002a, code lost:
    
        if (r5.contains(r6.getBounds()) != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(Rect rect, int i4, int i8, boolean[] zArr) {
        j.e(rect, "selectorArea");
        int i9 = this.f5678c;
        Rect rect2 = new Rect(i4 - i9, i8 - i9, i4 + i9, i8 + i9);
        Drawable drawable = this.f5679d;
        drawable.setBounds(rect2);
        boolean z8 = false;
        if (!zArr[0]) {
            boolean[] zArr2 = this.f5677b;
            if (zArr2[0]) {
            }
            if (!zArr2[0]) {
            }
        }
        z8 = true;
        this.f5680e = z8;
    }

    public void c(int i4) {
        this.f5679d.setAlpha(i4);
    }
}

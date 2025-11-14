package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.AppCompatImageView;
import com.buzbuz.smartautoclicker.R;
import i.AbstractC0862a;
import n.C1105b;

/* renamed from: o.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1193i extends AppCompatImageView implements InterfaceC1199l {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C1197k f13265g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1193i(C1197k c1197k, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.f13265g = c1197k;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        AbstractC0862a.w(this, getContentDescription());
        setOnTouchListener(new C1105b(this, this));
    }

    @Override // o.InterfaceC1199l
    public final boolean b() {
        return false;
    }

    @Override // o.InterfaceC1199l
    public final boolean c() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f13265g.n();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i4, int i8, int i9, int i10) {
        boolean frame = super.setFrame(i4, i8, i9, i10);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int max = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            background.setHotspotBounds(paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }
}

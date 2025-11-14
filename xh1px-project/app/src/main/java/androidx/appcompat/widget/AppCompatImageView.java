package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import o.C1207p;
import o.a1;
import o.b1;
import o.c1;

/* loaded from: classes.dex */
public class AppCompatImageView extends ImageView {

    /* renamed from: d, reason: collision with root package name */
    public final C1207p f8403d;

    /* renamed from: e, reason: collision with root package name */
    public final G.d f8404e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8405f;

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1207p c1207p = this.f8403d;
        if (c1207p != null) {
            c1207p.a();
        }
        G.d dVar = this.f8404e;
        if (dVar != null) {
            dVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1207p c1207p = this.f8403d;
        if (c1207p != null) {
            return c1207p.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1207p c1207p = this.f8403d;
        if (c1207p != null) {
            return c1207p.i();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        c1 c1Var;
        G.d dVar = this.f8404e;
        if (dVar == null || (c1Var = (c1) dVar.f1652d) == null) {
            return null;
        }
        return c1Var.f13235a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        c1 c1Var;
        G.d dVar = this.f8404e;
        if (dVar == null || (c1Var = (c1) dVar.f1652d) == null) {
            return null;
        }
        return c1Var.f13236b;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        if (!(((ImageView) this.f8404e.f1651c).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering()) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1207p c1207p = this.f8403d;
        if (c1207p != null) {
            c1207p.m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i4) {
        super.setBackgroundResource(i4);
        C1207p c1207p = this.f8403d;
        if (c1207p != null) {
            c1207p.n(i4);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        G.d dVar = this.f8404e;
        if (dVar != null) {
            dVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        G.d dVar = this.f8404e;
        if (dVar != null && drawable != null && !this.f8405f) {
            dVar.f1650b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (dVar != null) {
            dVar.a();
            if (!this.f8405f) {
                ImageView imageView = (ImageView) dVar.f1651c;
                if (imageView.getDrawable() != null) {
                    imageView.getDrawable().setLevel(dVar.f1650b);
                }
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i4) {
        super.setImageLevel(i4);
        this.f8405f = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i4) {
        G.d dVar = this.f8404e;
        if (dVar != null) {
            dVar.g(i4);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        G.d dVar = this.f8404e;
        if (dVar != null) {
            dVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1207p c1207p = this.f8403d;
        if (c1207p != null) {
            c1207p.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1207p c1207p = this.f8403d;
        if (c1207p != null) {
            c1207p.t(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        G.d dVar = this.f8404e;
        if (dVar != null) {
            if (((c1) dVar.f1652d) == null) {
                dVar.f1652d = new Object();
            }
            c1 c1Var = (c1) dVar.f1652d;
            c1Var.f13235a = colorStateList;
            c1Var.f13238d = true;
            dVar.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        G.d dVar = this.f8404e;
        if (dVar != null) {
            if (((c1) dVar.f1652d) == null) {
                dVar.f1652d = new Object();
            }
            c1 c1Var = (c1) dVar.f1652d;
            c1Var.f13236b = mode;
            c1Var.f13237c = true;
            dVar.a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatImageView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        b1.a(context);
        this.f8405f = false;
        a1.a(this, getContext());
        C1207p c1207p = new C1207p(this);
        this.f8403d = c1207p;
        c1207p.k(attributeSet, i4);
        G.d dVar = new G.d(this);
        this.f8404e = dVar;
        dVar.e(attributeSet, i4);
    }
}

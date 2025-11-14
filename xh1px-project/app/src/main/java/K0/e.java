package K0;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import w5.C1708a;

/* loaded from: classes.dex */
public final class e extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2537a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2538b;

    public e(C1708a c1708a) {
        this.f2538b = c1708a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public boolean canApplyTheme() {
        switch (this.f2537a) {
            case 0:
                return ((Drawable.ConstantState) this.f2538b).canApplyTheme();
            default:
                return super.canApplyTheme();
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        switch (this.f2537a) {
            case 0:
                return ((Drawable.ConstantState) this.f2538b).getChangingConfigurations();
            default:
                return 0;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        switch (this.f2537a) {
            case 0:
                f fVar = new f(null, 0);
                Drawable newDrawable = ((Drawable.ConstantState) this.f2538b).newDrawable();
                fVar.f2544d = newDrawable;
                newDrawable.setCallback(fVar.f2543i);
                return fVar;
            default:
                return (C1708a) this.f2538b;
        }
    }

    public e(Drawable.ConstantState constantState) {
        this.f2538b = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        switch (this.f2537a) {
            case 0:
                f fVar = new f(null, 0);
                Drawable newDrawable = ((Drawable.ConstantState) this.f2538b).newDrawable(resources);
                fVar.f2544d = newDrawable;
                newDrawable.setCallback(fVar.f2543i);
                return fVar;
            default:
                return super.newDrawable(resources);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources, Resources.Theme theme) {
        switch (this.f2537a) {
            case 0:
                f fVar = new f(null, 0);
                Drawable newDrawable = ((Drawable.ConstantState) this.f2538b).newDrawable(resources, theme);
                fVar.f2544d = newDrawable;
                newDrawable.setCallback(fVar.f2543i);
                return fVar;
            default:
                return super.newDrawable(resources, theme);
        }
    }
}

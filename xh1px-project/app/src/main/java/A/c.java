package A;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class c extends View {

    /* renamed from: d, reason: collision with root package name */
    public int[] f7d;

    /* renamed from: e, reason: collision with root package name */
    public int f8e;

    /* renamed from: f, reason: collision with root package name */
    public Context f9f;

    /* renamed from: g, reason: collision with root package name */
    public y.i f10g;

    /* renamed from: h, reason: collision with root package name */
    public String f11h;

    /* renamed from: i, reason: collision with root package name */
    public HashMap f12i;

    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0065 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(String str) {
        ConstraintLayout constraintLayout;
        int i4;
        Object obj;
        HashMap hashMap;
        Context context = this.f9f;
        if (str != null && str.length() != 0 && context != null) {
            String trim = str.trim();
            if (getParent() instanceof ConstraintLayout) {
            }
            if (getParent() instanceof ConstraintLayout) {
                constraintLayout = (ConstraintLayout) getParent();
            } else {
                constraintLayout = null;
            }
            if (isInEditMode() && constraintLayout != null) {
                if (trim != null && (hashMap = constraintLayout.f8526p) != null && hashMap.containsKey(trim)) {
                    obj = constraintLayout.f8526p.get(trim);
                } else {
                    obj = null;
                }
                if (obj instanceof Integer) {
                    i4 = ((Integer) obj).intValue();
                    if (i4 == 0 && constraintLayout != null) {
                        i4 = d(constraintLayout, trim);
                    }
                    if (i4 == 0) {
                        try {
                            i4 = r.class.getField(trim).getInt(null);
                        } catch (Exception unused) {
                        }
                    }
                    if (i4 == 0) {
                        i4 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
                    }
                    if (i4 == 0) {
                        this.f12i.put(Integer.valueOf(i4), trim);
                        b(i4);
                        return;
                    } else {
                        Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
                        return;
                    }
                }
            }
            i4 = 0;
            if (i4 == 0) {
                i4 = d(constraintLayout, trim);
            }
            if (i4 == 0) {
            }
            if (i4 == 0) {
            }
            if (i4 == 0) {
            }
        }
    }

    public final void b(int i4) {
        if (i4 == getId()) {
            return;
        }
        int i8 = this.f8e + 1;
        int[] iArr = this.f7d;
        if (i8 > iArr.length) {
            this.f7d = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f7d;
        int i9 = this.f8e;
        iArr2[i9] = i4;
        this.f8e = i9 + 1;
    }

    public final void c() {
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) parent;
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i4 = 0; i4 < this.f8e; i4++) {
                View view = (View) constraintLayout.f8516d.get(this.f7d[i4]);
                if (view != null) {
                    view.setVisibility(visibility);
                    if (elevation > 0.0f) {
                        view.setTranslationZ(view.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    public final int d(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String str2;
        if (str != null && (resources = this.f9f.getResources()) != null) {
            int childCount = constraintLayout.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = constraintLayout.getChildAt(i4);
                if (childAt.getId() != -1) {
                    try {
                        str2 = resources.getResourceEntryName(childAt.getId());
                    } catch (Resources.NotFoundException unused) {
                        str2 = null;
                    }
                    if (str.equals(str2)) {
                        return childAt.getId();
                    }
                }
            }
        }
        return 0;
    }

    public void e(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, s.f179b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == 19) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f11h = string;
                    setIds(string);
                }
            }
        }
    }

    public abstract void f(y.d dVar, boolean z8);

    public final void g() {
        if (this.f10g != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof e) {
                ((e) layoutParams).f56k0 = this.f10g;
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f7d, this.f8e);
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f11h;
        if (str != null) {
            setIds(str);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i4, int i8) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.f11h = str;
        if (str == null) {
            return;
        }
        int i4 = 0;
        this.f8e = 0;
        while (true) {
            int indexOf = str.indexOf(44, i4);
            if (indexOf == -1) {
                a(str.substring(i4));
                return;
            } else {
                a(str.substring(i4, indexOf));
                i4 = indexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f11h = null;
        this.f8e = 0;
        for (int i4 : iArr) {
            b(i4);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }
}

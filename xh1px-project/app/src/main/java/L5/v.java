package L5;

import P.O;
import a.AbstractC0405a;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import o.C1178a0;
import u6.AbstractC1638C;

/* loaded from: classes.dex */
public final class v extends LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final TextInputLayout f3034d;

    /* renamed from: e, reason: collision with root package name */
    public final C1178a0 f3035e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f3036f;

    /* renamed from: g, reason: collision with root package name */
    public final CheckableImageButton f3037g;

    /* renamed from: h, reason: collision with root package name */
    public ColorStateList f3038h;

    /* renamed from: i, reason: collision with root package name */
    public PorterDuff.Mode f3039i;
    public int j;
    public ImageView.ScaleType k;

    /* renamed from: l, reason: collision with root package name */
    public View.OnLongClickListener f3040l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3041m;

    public v(TextInputLayout textInputLayout, R.g gVar) {
        super(textInputLayout.getContext());
        CharSequence text;
        this.f3034d = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f3037g = checkableImageButton;
        C1178a0 c1178a0 = new C1178a0(getContext(), null);
        this.f3035e = c1178a0;
        if (AbstractC0405a.a0(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.f3040l;
        checkableImageButton.setOnClickListener(null);
        AbstractC1638C.K(checkableImageButton, onLongClickListener);
        this.f3040l = null;
        checkableImageButton.setOnLongClickListener(null);
        AbstractC1638C.K(checkableImageButton, null);
        TypedArray typedArray = (TypedArray) gVar.f4988f;
        if (typedArray.hasValue(69)) {
            this.f3038h = AbstractC0405a.B(getContext(), gVar, 69);
        }
        if (typedArray.hasValue(70)) {
            this.f3039i = x5.p.j(typedArray.getInt(70, -1), null);
        }
        if (typedArray.hasValue(66)) {
            b(gVar.A(66));
            if (typedArray.hasValue(65) && checkableImageButton.getContentDescription() != (text = typedArray.getText(65))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(64, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(67, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize >= 0) {
            if (dimensionPixelSize != this.j) {
                this.j = dimensionPixelSize;
                checkableImageButton.setMinimumWidth(dimensionPixelSize);
                checkableImageButton.setMinimumHeight(dimensionPixelSize);
            }
            if (typedArray.hasValue(68)) {
                ImageView.ScaleType o7 = AbstractC1638C.o(typedArray.getInt(68, -1));
                this.k = o7;
                checkableImageButton.setScaleType(o7);
            }
            c1178a0.setVisibility(8);
            c1178a0.setId(R.id.textinput_prefix_text);
            c1178a0.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            WeakHashMap weakHashMap = O.f4214a;
            c1178a0.setAccessibilityLiveRegion(1);
            c1178a0.setTextAppearance(typedArray.getResourceId(60, 0));
            if (typedArray.hasValue(61)) {
                c1178a0.setTextColor(gVar.z(61));
            }
            CharSequence text2 = typedArray.getText(59);
            this.f3036f = TextUtils.isEmpty(text2) ? null : text2;
            c1178a0.setText(text2);
            e();
            addView(checkableImageButton);
            addView(c1178a0);
            return;
        }
        throw new IllegalArgumentException("startIconSize cannot be less than 0");
    }

    public final int a() {
        int i4;
        CheckableImageButton checkableImageButton = this.f3037g;
        if (checkableImageButton.getVisibility() == 0) {
            i4 = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            i4 = 0;
        }
        WeakHashMap weakHashMap = O.f4214a;
        return this.f3035e.getPaddingStart() + getPaddingStart() + i4;
    }

    public final void b(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f3037g;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f3038h;
            PorterDuff.Mode mode = this.f3039i;
            TextInputLayout textInputLayout = this.f3034d;
            AbstractC1638C.i(textInputLayout, checkableImageButton, colorStateList, mode);
            c(true);
            AbstractC1638C.H(textInputLayout, checkableImageButton, this.f3038h);
            return;
        }
        c(false);
        View.OnLongClickListener onLongClickListener = this.f3040l;
        checkableImageButton.setOnClickListener(null);
        AbstractC1638C.K(checkableImageButton, onLongClickListener);
        this.f3040l = null;
        checkableImageButton.setOnLongClickListener(null);
        AbstractC1638C.K(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    public final void c(boolean z8) {
        boolean z9;
        CheckableImageButton checkableImageButton = this.f3037g;
        int i4 = 0;
        if (checkableImageButton.getVisibility() == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9 != z8) {
            if (!z8) {
                i4 = 8;
            }
            checkableImageButton.setVisibility(i4);
            d();
            e();
        }
    }

    public final void d() {
        int paddingStart;
        EditText editText = this.f3034d.f10276g;
        if (editText == null) {
            return;
        }
        if (this.f3037g.getVisibility() == 0) {
            paddingStart = 0;
        } else {
            WeakHashMap weakHashMap = O.f4214a;
            paddingStart = editText.getPaddingStart();
        }
        int compoundPaddingTop = editText.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = editText.getCompoundPaddingBottom();
        WeakHashMap weakHashMap2 = O.f4214a;
        this.f3035e.setPaddingRelative(paddingStart, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    public final void e() {
        int i4;
        int i8 = 8;
        if (this.f3036f != null && !this.f3041m) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        if (this.f3037g.getVisibility() == 0 || i4 == 0) {
            i8 = 0;
        }
        setVisibility(i8);
        this.f3035e.setVisibility(i4);
        this.f3034d.q();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i4, int i8) {
        super.onMeasure(i4, i8);
        d();
    }
}

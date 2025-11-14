package Q;

import O7.C0235h;
import P.AbstractC0274w;
import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: c, reason: collision with root package name */
    public static int f4708c;

    /* renamed from: a, reason: collision with root package name */
    public final AccessibilityNodeInfo f4709a;

    /* renamed from: b, reason: collision with root package name */
    public int f4710b = -1;

    public g(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f4709a = accessibilityNodeInfo;
    }

    public static String d(int i4) {
        if (i4 != 1) {
            if (i4 != 2) {
                switch (i4) {
                    case Z.g.LONG_FIELD_NUMBER /* 4 */:
                        return "ACTION_SELECT";
                    case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                        return "ACTION_CLEAR_SELECTION";
                    case 16:
                        return "ACTION_CLICK";
                    case 32:
                        return "ACTION_LONG_CLICK";
                    case 64:
                        return "ACTION_ACCESSIBILITY_FOCUS";
                    case 128:
                        return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                    case 256:
                        return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                    case 512:
                        return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                    case 1024:
                        return "ACTION_NEXT_HTML_ELEMENT";
                    case 2048:
                        return "ACTION_PREVIOUS_HTML_ELEMENT";
                    case 4096:
                        return "ACTION_SCROLL_FORWARD";
                    case 8192:
                        return "ACTION_SCROLL_BACKWARD";
                    case 16384:
                        return "ACTION_COPY";
                    case 32768:
                        return "ACTION_PASTE";
                    case 65536:
                        return "ACTION_CUT";
                    case 131072:
                        return "ACTION_SET_SELECTION";
                    case 262144:
                        return "ACTION_EXPAND";
                    case 524288:
                        return "ACTION_COLLAPSE";
                    case 2097152:
                        return "ACTION_SET_TEXT";
                    case R.id.accessibilityActionMoveWindow:
                        return "ACTION_MOVE_WINDOW";
                    case R.id.KEYCODE_3D_MODE:
                        return "ACTION_SCROLL_IN_DIRECTION";
                    default:
                        switch (i4) {
                            case R.id.accessibilityActionShowOnScreen:
                                return "ACTION_SHOW_ON_SCREEN";
                            case R.id.accessibilityActionScrollToPosition:
                                return "ACTION_SCROLL_TO_POSITION";
                            case R.id.accessibilityActionScrollUp:
                                return "ACTION_SCROLL_UP";
                            case R.id.accessibilityActionScrollLeft:
                                return "ACTION_SCROLL_LEFT";
                            case R.id.accessibilityActionScrollDown:
                                return "ACTION_SCROLL_DOWN";
                            case R.id.accessibilityActionScrollRight:
                                return "ACTION_SCROLL_RIGHT";
                            case R.id.accessibilityActionContextClick:
                                return "ACTION_CONTEXT_CLICK";
                            case R.id.accessibilityActionSetProgress:
                                return "ACTION_SET_PROGRESS";
                            default:
                                switch (i4) {
                                    case R.id.accessibilityActionShowTooltip:
                                        return "ACTION_SHOW_TOOLTIP";
                                    case R.id.accessibilityActionHideTooltip:
                                        return "ACTION_HIDE_TOOLTIP";
                                    case R.id.accessibilityActionPageUp:
                                        return "ACTION_PAGE_UP";
                                    case R.id.accessibilityActionPageDown:
                                        return "ACTION_PAGE_DOWN";
                                    case R.id.accessibilityActionPageLeft:
                                        return "ACTION_PAGE_LEFT";
                                    case R.id.accessibilityActionPageRight:
                                        return "ACTION_PAGE_RIGHT";
                                    case R.id.accessibilityActionPressAndHold:
                                        return "ACTION_PRESS_AND_HOLD";
                                    default:
                                        switch (i4) {
                                            case R.id.accessibilityActionImeEnter:
                                                return "ACTION_IME_ENTER";
                                            case R.id.ALT:
                                                return "ACTION_DRAG_START";
                                            case R.id.CTRL:
                                                return "ACTION_DRAG_DROP";
                                            case R.id.FUNCTION:
                                                return "ACTION_DRAG_CANCEL";
                                            default:
                                                return "ACTION_UNKNOWN";
                                        }
                                }
                        }
                }
            }
            return "ACTION_CLEAR_FOCUS";
        }
        return "ACTION_FOCUS";
    }

    public final void a(int i4) {
        this.f4709a.addAction(i4);
    }

    public final void b(f fVar) {
        this.f4709a.addAction((AccessibilityNodeInfo.AccessibilityAction) fVar.f4704a);
    }

    public final ArrayList c(String str) {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f4709a;
        ArrayList<Integer> integerArrayList = accessibilityNodeInfo.getExtras().getIntegerArrayList(str);
        if (integerArrayList == null) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            accessibilityNodeInfo.getExtras().putIntegerArrayList(str, arrayList);
            return arrayList;
        }
        return integerArrayList;
    }

    public final boolean e(int i4) {
        Bundle extras = this.f4709a.getExtras();
        if (extras == null || (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i4) != i4) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof g)) {
            g gVar = (g) obj;
            AccessibilityNodeInfo accessibilityNodeInfo = gVar.f4709a;
            AccessibilityNodeInfo accessibilityNodeInfo2 = this.f4709a;
            if (accessibilityNodeInfo2 == null) {
                if (accessibilityNodeInfo != null) {
                    return false;
                }
            } else if (!accessibilityNodeInfo2.equals(accessibilityNodeInfo)) {
                return false;
            }
            if (this.f4710b == gVar.f4710b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void f(Rect rect) {
        this.f4709a.getBoundsInParent(rect);
    }

    public final CharSequence g() {
        boolean isEmpty = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
        AccessibilityNodeInfo accessibilityNodeInfo = this.f4709a;
        if (!isEmpty) {
            ArrayList c6 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            ArrayList c9 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            ArrayList c10 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            ArrayList c11 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SpannableString spannableString = new SpannableString(TextUtils.substring(accessibilityNodeInfo.getText(), 0, accessibilityNodeInfo.getText().length()));
            for (int i4 = 0; i4 < c6.size(); i4++) {
                spannableString.setSpan(new a(((Integer) c11.get(i4)).intValue(), this, accessibilityNodeInfo.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) c6.get(i4)).intValue(), ((Integer) c9.get(i4)).intValue(), ((Integer) c10.get(i4)).intValue());
            }
            return spannableString;
        }
        return accessibilityNodeInfo.getText();
    }

    public final void h(int i4, boolean z8) {
        Bundle extras = this.f4709a.getExtras();
        if (extras != null) {
            int i8 = extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i4);
            if (!z8) {
                i4 = 0;
            }
            extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i4 | i8);
        }
    }

    public final int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f4709a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public final void i(CharSequence charSequence) {
        this.f4709a.setClassName(charSequence);
    }

    public final void j(C0235h c0235h) {
        this.f4709a.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) c0235h.f4138d);
    }

    public final void k(String str) {
        int i4 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f4709a;
        if (i4 >= 26) {
            accessibilityNodeInfo.setHintText(str);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", str);
        }
    }

    public final void l(boolean z8) {
        this.f4709a.setScrollable(z8);
    }

    public final void m(CharSequence charSequence) {
        this.f4709a.setText(charSequence);
    }

    public final String toString() {
        CharSequence charSequence;
        CharSequence charSequence2;
        String string;
        CharSequence charSequence3;
        boolean e9;
        boolean e10;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        f(rect);
        sb.append("; boundsInParent: " + rect);
        AccessibilityNodeInfo accessibilityNodeInfo = this.f4709a;
        accessibilityNodeInfo.getBoundsInScreen(rect);
        sb.append("; boundsInScreen: " + rect);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 34) {
            AbstractC0274w.c(accessibilityNodeInfo, rect);
        } else {
            Rect rect2 = (Rect) accessibilityNodeInfo.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
            if (rect2 != null) {
                rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
            }
        }
        sb.append("; boundsInWindow: " + rect);
        sb.append("; packageName: ");
        sb.append(accessibilityNodeInfo.getPackageName());
        sb.append("; className: ");
        sb.append(accessibilityNodeInfo.getClassName());
        sb.append("; text: ");
        sb.append(g());
        sb.append("; error: ");
        sb.append(accessibilityNodeInfo.getError());
        sb.append("; maxTextLength: ");
        sb.append(accessibilityNodeInfo.getMaxTextLength());
        sb.append("; stateDescription: ");
        if (i4 >= 30) {
            charSequence = I.b.c(accessibilityNodeInfo);
        } else {
            charSequence = accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
        }
        sb.append(charSequence);
        sb.append("; contentDescription: ");
        sb.append(accessibilityNodeInfo.getContentDescription());
        sb.append("; tooltipText: ");
        if (i4 >= 28) {
            charSequence2 = accessibilityNodeInfo.getTooltipText();
        } else {
            charSequence2 = accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY");
        }
        sb.append(charSequence2);
        sb.append("; viewIdResName: ");
        sb.append(accessibilityNodeInfo.getViewIdResourceName());
        sb.append("; uniqueId: ");
        if (i4 >= 33) {
            string = L.b.b(accessibilityNodeInfo);
        } else {
            string = accessibilityNodeInfo.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
        }
        sb.append(string);
        sb.append("; checkable: ");
        sb.append(accessibilityNodeInfo.isCheckable());
        sb.append("; checked: ");
        sb.append(accessibilityNodeInfo.isChecked());
        sb.append("; fieldRequired: ");
        sb.append(accessibilityNodeInfo.getExtras().getBoolean("androidx.view.accessibility.AccessibilityNodeInfoCompat.IS_REQUIRED_KEY"));
        sb.append("; focusable: ");
        sb.append(accessibilityNodeInfo.isFocusable());
        sb.append("; focused: ");
        sb.append(accessibilityNodeInfo.isFocused());
        sb.append("; selected: ");
        sb.append(accessibilityNodeInfo.isSelected());
        sb.append("; clickable: ");
        sb.append(accessibilityNodeInfo.isClickable());
        sb.append("; longClickable: ");
        sb.append(accessibilityNodeInfo.isLongClickable());
        sb.append("; contextClickable: ");
        sb.append(accessibilityNodeInfo.isContextClickable());
        sb.append("; enabled: ");
        sb.append(accessibilityNodeInfo.isEnabled());
        sb.append("; password: ");
        sb.append(accessibilityNodeInfo.isPassword());
        sb.append("; scrollable: " + accessibilityNodeInfo.isScrollable());
        sb.append("; containerTitle: ");
        if (i4 >= 34) {
            charSequence3 = AbstractC0274w.d(accessibilityNodeInfo);
        } else {
            charSequence3 = accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY");
        }
        sb.append(charSequence3);
        sb.append("; granularScrollingSupported: ");
        sb.append(e(67108864));
        sb.append("; importantForAccessibility: ");
        sb.append(accessibilityNodeInfo.isImportantForAccessibility());
        sb.append("; visible: ");
        sb.append(accessibilityNodeInfo.isVisibleToUser());
        sb.append("; isTextSelectable: ");
        if (i4 >= 33) {
            e9 = L.b.c(accessibilityNodeInfo);
        } else {
            e9 = e(8388608);
        }
        sb.append(e9);
        sb.append("; accessibilityDataSensitive: ");
        if (i4 >= 34) {
            e10 = AbstractC0274w.g(accessibilityNodeInfo);
        } else {
            e10 = e(64);
        }
        sb.append(e10);
        sb.append("; [");
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = accessibilityNodeInfo.getActionList();
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i8 = 0; i8 < size; i8++) {
            arrayList.add(new f(actionList.get(i8), 0, null, null, null));
        }
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            f fVar = (f) arrayList.get(i9);
            int a3 = fVar.a();
            Object obj = fVar.f4704a;
            String d2 = d(a3);
            if (d2.equals("ACTION_UNKNOWN") && ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                d2 = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
            sb.append(d2);
            if (i9 != arrayList.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}

# 📱 Mapping Material 2 → Material 3 (Android)

![Material 2 vs Material 3 Demo](assets/material2-vs-material3.png)

---

## 1. 🎨 Theme & Parent
| **Material 2** | **Material 3** |
|:----------------|:---------------|
| `Theme.MaterialComponents.DayNight.*` | `Theme.Material3.DayNight.*` |
| `Theme.MaterialComponents.Light.*` | `Theme.Material3.Light.*` |
| `ThemeOverlay.MaterialComponents.*` | `ThemeOverlay.Material3.*` |

---

## 2. 🔘 Buttons
| **M2** | **M3** |
|:-------|:-------|
| `Widget.MaterialComponents.Button` | `Widget.Material3.Button.Filled` |
| `Widget.MaterialComponents.Button.OutlinedButton` | `Widget.Material3.Button.Outlined` |
| `Widget.MaterialComponents.Button.TextButton` | `Widget.Material3.Button.Text` |
| *(Không có)* | `Widget.Material3.Button.Elevated` |
| *(Không có)* | `Widget.Material3.Button.Tonal` |

---

## 3. 📝 Text Field
| **M2** | **M3** |
|:-------|:-------|
| `Widget.MaterialComponents.TextInputLayout.OutlinedBox` | `Widget.Material3.TextInputLayout.OutlinedBox` |
| `Widget.MaterialComponents.TextInputLayout.FilledBox` | `Widget.Material3.TextInputLayout.FilledBox` |
| `Widget.MaterialComponents.TextInputEditText.OutlinedBox` | `Widget.Material3.TextInputEditText.OutlinedBox` |
| `Widget.MaterialComponents.TextInputEditText.FilledBox` | `Widget.Material3.TextInputEditText.FilledBox` |

---

## 4. 🪂 Floating Action Button (FAB)
| **M2** | **M3** |
|:-------|:-------|
| `Widget.MaterialComponents.FloatingActionButton` | `Widget.Material3.FloatingActionButton` |
| *(Không có)* | `Widget.Material3.FloatingActionButton.Small` |
| *(Không có)* | `Widget.Material3.FloatingActionButton.Large` |
| *(Không có)* | `Widget.Material3.FloatingActionButton.Surface` |

---

## 5. 🃏 Card
| **M2** | **M3** |
|:-------|:-------|
| `Widget.MaterialComponents.CardView` | `Widget.Material3.CardView.Elevated` |
| *(Không có)* | `Widget.Material3.CardView.Outlined` |
| *(Không có)* | `Widget.Material3.CardView.Filled` |

---

## 6. 🧭 Navigation
| **M2** | **M3** |
|:-------|:-------|
| `Widget.MaterialComponents.BottomNavigationView` | `Widget.Material3.NavigationBarView` |
| `Widget.MaterialComponents.TabLayout` | `Widget.Material3.TabLayout` |
| *(Không có)* | `Widget.Material3.NavigationRailView` |

---

## 7. 🏷 Chips
| **M2** | **M3** |
|:-------|:-------|
| `Widget.MaterialComponents.Chip` | `Widget.Material3.Chip.Assist` |
| *(Không có)* | `Widget.Material3.Chip.Filter` |
| *(Không có)* | `Widget.Material3.Chip.Input` |
| *(Không có)* | `Widget.Material3.Chip.Suggestion` |

---

## 8. 🎚 Slider / Switch
| **M2** | **M3** |
|:-------|:-------|
| `Widget.MaterialComponents.Slider` | `Widget.Material3.Slider` |
| `Widget.MaterialComponents.SwitchMaterial` | `Widget.Material3.Switch` |

---

## 9. ✍ Typography
| **M2 (TextAppearance)** | **M3 (TextAppearance)** |
|:------------------------|:------------------------|
| `TextAppearance.MaterialComponents.Headline1` | `TextAppearance.Material3.DisplayLarge` |
| `TextAppearance.MaterialComponents.Headline2` | `TextAppearance.Material3.DisplayMedium` |
| `TextAppearance.MaterialComponents.Headline3` | `TextAppearance.Material3.DisplaySmall` |
| `TextAppearance.MaterialComponents.Headline4` | `TextAppearance.Material3.HeadlineLarge` |
| `TextAppearance.MaterialComponents.Headline5` | `TextAppearance.Material3.HeadlineMedium` |
| `TextAppearance.MaterialComponents.Headline6` | `TextAppearance.Material3.HeadlineSmall` |
| `TextAppearance.MaterialComponents.Subtitle1` | `TextAppearance.Material3.TitleLarge` |
| `TextAppearance.MaterialComponents.Subtitle2` | `TextAppearance.Material3.TitleMedium` |
| `TextAppearance.MaterialComponents.Body1` | `TextAppearance.Material3.BodyLarge` |
| `TextAppearance.MaterialComponents.Body2` | `TextAppearance.Material3.BodyMedium` |
| `TextAppearance.MaterialComponents.Button` | `TextAppearance.Material3.LabelLarge` |
| `TextAppearance.MaterialComponents.Caption` | `TextAppearance.Material3.BodySmall` |
| `TextAppearance.MaterialComponents.Overline` | `TextAppearance.Material3.LabelSmall` |

---

## 10. 🖥 Edge-to-Edge & Dynamic Colors
| **M2** | **M3** |
|:-------|:-------|
| *(Không có)* | `EdgeToEdge.enable(activity)` |
| *(Không có)* | `DynamicColors.applyToActivitiesIfAvailable(Application, DynamicColorsOptions)` |

---

## 11. 🌈 Colors
| **M2 Colors** | **M3 Colors** |
|:--------------|:--------------|
| `colorPrimary` | `colorPrimary` (tone 40 của palette) |
| `colorPrimaryVariant` | `colorPrimaryContainer` |
| `colorSecondary` | `colorSecondary` |
| `colorSecondaryVariant` | `colorSecondaryContainer` |
| `colorSurface` | `surface` (tone 98 light / 6 dark) |
| `colorBackground` | `background` |
| `colorError` | `error` |
| *(Không có)* | `tertiary`, `onTertiary`, `tertiaryContainer` |
| *(Không có)* | `outline`, `surfaceVariant` |

---

💡 **Tips khi migrate:**
- Đổi **parent theme** sang `Theme.Material3.*`
- Update **colors** theo `md_theme_light_*` và `md_theme_dark_*`
- Dùng **typography** mới
- Gọi `DynamicColors.applyToActivitiesIfAvailable()` để kích hoạt Material You

---

## ⚠️ **Chú ý quan trọng khi migrate M2 → M3:**

### 🔧 **Breaking Changes:**
- **Minimum API Level**: Material 3 yêu cầu API 21+ (Android 5.0)
- **Theme inheritance**: Phải thay đổi parent theme từ `Theme.MaterialComponents.*` sang `Theme.Material3.*`
- **Color attributes**: Một số color attributes đã bị deprecated và thay thế

### 🎨 **Design System Changes:**
- **Elevation**: M3 sử dụng elevation system mới với `surfaceVariant` và `outline`
- **Shape**: Corner radius mặc định thay đổi (từ 4dp → 16dp cho buttons)
- **Motion**: Animation curves và duration đã được cập nhật
- **Spacing**: Một số spacing values đã thay đổi theo design tokens

### 📱 **Component Behavior:**
- **Buttons**: Elevated và Tonal buttons là mới, không có equivalent trong M2
- **Navigation**: `BottomNavigationView` → `NavigationBarView` với behavior khác
- **Cards**: M3 có 3 variants (Elevated, Outlined, Filled) thay vì chỉ 1
- **Chips**: M3 có 4 types với behavior khác nhau

---

## 🚀 **Best Practices khi sử dụng Material 3:**

### 1. **Dynamic Colors & Material You:**
```kotlin
// Kích hoạt Material You (Android 12+)
DynamicColors.applyToActivitiesIfAvailable(
    application,
    DynamicColorsOptions.Builder().build()
)
```

### 2. **Edge-to-Edge Design:**
```kotlin
// Kích hoạt edge-to-edge
EdgeToEdge.enable(activity)
// Hoặc trong theme
<style name="Theme.App" parent="Theme.Material3.DayNight">
    <item name="android:windowLayoutInDisplayCutoutMode">shortEdges</item>
</style>
```

### 3. **Color System:**
```xml
<!-- Sử dụng semantic colors thay vì hardcode -->
<color name="md_theme_light_primary">#006C4C</color>
<color name="md_theme_light_onPrimary">#FFFFFF</color>
<color name="md_theme_light_primaryContainer">#89F8C7</color>
<color name="md_theme_light_onPrimaryContainer">#002114</color>
```

### 4. **Typography Scale:**
```xml
<!-- Sử dụng M3 typography scale -->
<item name="textAppearanceHeadlineLarge">@style/TextAppearance.Material3.HeadlineLarge</item>
<item name="textAppearanceBodyLarge">@style/TextAppearance.Material3.BodyLarge</item>
```

### 5. **Shape System:**
```xml
<!-- Custom shape cho components -->
<style name="ShapeAppearance.App.SmallComponent" parent="ShapeAppearance.Material3.SmallComponent">
    <item name="cornerFamily">rounded</item>
    <item name="cornerSize">8dp</item>
</style>
```

---

## 🔍 **Testing Checklist:**

- [ ] App chạy được trên API 21+
- [ ] Tất cả themes đã được update sang M3
- [ ] Colors sử dụng M3 color system
- [ ] Typography sử dụng M3 text styles
- [ ] Components sử dụng M3 widgets
- [ ] Dynamic colors hoạt động (Android 12+)
- [ ] Edge-to-edge design hoạt động
- [ ] Dark theme hoạt động đúng
- [ ] Accessibility features hoạt động

---

## 📚 **Resources:**

- [Material 3 Design Kit](https://www.figma.com/community/file/1035203688168086460)
- [Material 3 Components](https://m3.material.io/components)
- [Material 3 Migration Guide](https://m3.material.io/foundations/migrating-from-material-2)
- [Material 3 GitHub Samples](https://github.com/material-components/material-components-android) 